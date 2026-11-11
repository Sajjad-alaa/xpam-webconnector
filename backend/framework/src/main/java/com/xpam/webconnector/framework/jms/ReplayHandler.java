package com.xpam.webconnector.framework.jms;

import com.xpam.webconnector.framework.jms.exception.ReplayException;

public interface ReplayHandler {

    void init();

    void release() throws ReplayException;

    void writeRow(String row);

    void writeInput(String input);
    void writeOutput(String input);
}
