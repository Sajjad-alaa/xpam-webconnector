package com.xpam.webconnector.framework.console;


import com.xpam.webconnector.framework.ws.io.Packet;
import com.xpam.webconnector.framework.console.entity.request.Connect;
import com.xpam.webconnector.framework.console.context.ConsoleContext;

public interface Console {
    String getTitle();
    String getNodeKey();
    ConsoleContext getContext();
    void onInit(Connect connect);

    void handle(Packet packet);

    void close();
}
