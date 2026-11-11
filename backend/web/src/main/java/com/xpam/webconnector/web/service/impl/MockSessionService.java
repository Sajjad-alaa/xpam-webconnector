package com.xpam.webconnector.web.service.impl;

import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.session.Session;
import com.xpam.webconnector.framework.session.impl.BaseSession;
import com.xpam.webconnector.web.config.MockConfig;
import com.xpam.webconnector.web.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockSessionService implements SessionService {

    @Autowired
    private MockConfig mockConfig;

    @Override
    public Session createNewSession(String token, String remoteAddr) {
        var dbType = token != null ? token.toLowerCase() : "mysql";
        var connectInfo = mockConfig.getMockDBInfo(dbType);
        var ds = DatasourceFactory
                .fromConnectInfo(connectInfo);
        return new BaseSession(ds, remoteAddr);
    }
}
