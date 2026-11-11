package com.xpam.webconnector.framework.console.component;

import com.xpam.webconnector.framework.ws.io.Packet;
import com.xpam.webconnector.framework.console.entity.response.Message;
import com.xpam.webconnector.framework.ws.io.PacketIO;

public class Messager {
    private final PacketIO packetIO;

    public Messager(PacketIO packetIO) {
        this.packetIO = packetIO;
    }

    public void send(Message msg) {
        this.packetIO.sendPacket(Packet.TYPE_MESSAGE, msg);
    }

    public void sendGlobal(Message msg) {
        this.packetIO.sendPacket(Packet.TYPE_GLOBAL_MESSAGE, msg);
    }
}
