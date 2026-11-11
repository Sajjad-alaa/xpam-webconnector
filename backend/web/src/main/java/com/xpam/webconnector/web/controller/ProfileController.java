package com.xpam.webconnector.web.controller;

import com.xpam.webconnector.framework.datasource.Datasource;
import com.xpam.webconnector.framework.session.SessionManager;
import com.xpam.webconnector.web.entity.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @GetMapping("")
    private Profile getProfile() {
        Datasource ds = SessionManager.getCurrentSession().getDatasource();
        var connectionInfo = ds.getConnectInfo();
        Profile profile = new Profile();
        profile.setDbType(connectionInfo.getDbType());
        profile.setCanCopy(SessionManager.getCurrentSession().canCopy());
        profile.setCanPaste(SessionManager.getCurrentSession().canPaste());
        return profile;
    }
}
