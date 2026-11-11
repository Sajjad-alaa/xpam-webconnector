package com.xpam.webconnector.web.exception;

public class WebConnectorException extends RuntimeException {

    public WebConnectorException(String message) {
        super(message);
    }

    public WebConnectorException(String message, Throwable cause) {
        super(message + ":" + cause.getMessage(), cause);
    }

}
