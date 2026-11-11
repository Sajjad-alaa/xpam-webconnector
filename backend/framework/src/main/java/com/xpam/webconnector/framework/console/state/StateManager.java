package com.xpam.webconnector.framework.console.state;

import lombok.Getter;
import com.xpam.webconnector.framework.ws.io.PacketIO;
import com.xpam.webconnector.framework.ws.io.Packet;


public class StateManager<T extends State> {

    @Getter
    private final T state;

    @Getter
    private final PacketIO packetIO;

    public StateManager(T state, PacketIO packetIO) {
        this.packetIO = packetIO;
        this.state = state;
    }

    public void commit() {
        this.packetIO.sendPacket(Packet.TYPE_UPDATE_STATE, this.state);
    }

}
