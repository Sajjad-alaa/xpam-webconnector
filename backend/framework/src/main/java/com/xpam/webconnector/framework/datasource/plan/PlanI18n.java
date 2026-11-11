package com.xpam.webconnector.framework.datasource.plan;

import com.xpam.webconnector.framework.i18n.MessageUtils;

public final class PlanI18n {
    private PlanI18n() {
    }

    public static String msg(String key, String english, Object... args) {
        return MessageUtils.getOrDefault(key, english, args);
    }
}
