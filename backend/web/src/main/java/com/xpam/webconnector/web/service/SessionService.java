package com.xpam.webconnector.web.service;


import com.xpam.webconnector.framework.session.Session;

public interface SessionService {
    Session createNewSession(String token,String remoteAddr);
}
