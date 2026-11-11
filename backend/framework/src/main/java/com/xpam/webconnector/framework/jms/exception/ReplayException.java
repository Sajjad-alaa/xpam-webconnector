package com.xpam.webconnector.framework.jms.exception;

public class ReplayException extends RuntimeException {
    public ReplayException(String replayName, String message) {
        super(String.format("Replay %s error: %s", replayName, message));
    }
}