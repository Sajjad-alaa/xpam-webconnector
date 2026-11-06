package org.jumpserver.chen.web.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jumpserver.chen.web.exception.ChenException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@Component
@Slf4j
public class WebExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof ChenException) {
            response.setStatus(500);
            response.setHeader("Content-Type", "application/json");
            try {
                response.getWriter().write(ex.getMessage());
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        } else {
            log.error(ex.getMessage(), ex);
            // XPAM: report the failure instead of an empty HTTP 200 (no stack trace / internals)
            var msg = "Internal error";
            if (ex instanceof IllegalArgumentException || ex instanceof IllegalStateException
                    || ex.getClass() == RuntimeException.class) {
                if (ex.getMessage() != null && !ex.getMessage().isBlank()) {
                    msg = ex.getMessage();
                }
            }
            if (msg.length() > 300) {
                msg = msg.substring(0, 300);
            }
            var body = "{\"error\":\"" + jsonEscape(msg) + "\"}";
            int status = ex instanceof SecurityException ? 403 : 500;
            if (!response.isCommitted()) {
                response.setStatus(status);
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                try {
                    response.getWriter().write(body);
                } catch (IOException e) {
                    log.error(e.getMessage());
                }
            }
        }
        return new ModelAndView();
    }

    private static String jsonEscape(String s) {
        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"' -> sb.append("\\\"");
                case '\\' -> sb.append("\\\\");
                default -> {
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
