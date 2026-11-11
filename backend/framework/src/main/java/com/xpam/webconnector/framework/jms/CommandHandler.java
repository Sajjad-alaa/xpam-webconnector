package com.xpam.webconnector.framework.jms;

import com.xpam.webconnector.framework.jms.entity.CommandRecord;

public interface CommandHandler {
    void recordCommand(CommandRecord commandRecord);

}
