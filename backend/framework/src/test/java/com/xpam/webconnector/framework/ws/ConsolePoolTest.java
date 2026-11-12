package com.xpam.webconnector.framework.ws;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

// XPAM: consoles that wait a long time (a reviewer, a slow query) do not stall the others: more than ten run at once.
class ConsolePoolTest {

    @Test
    void longWaitsDoNotStallOtherConsoles() throws Exception {
        var pool = ConsoleWebSocketHandler.consolePool();
        var started = new CountDownLatch(20);
        var release = new CountDownLatch(1);
        try {
            for (int i = 0; i < 20; i++) {
                pool.execute(() -> {
                    started.countDown();
                    try {
                        release.await(30, TimeUnit.SECONDS);
                    } catch (InterruptedException ignored) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
            assertTrue(started.await(10, TimeUnit.SECONDS), "20 waiting consoles must all be running");
        } finally {
            release.countDown();
            pool.shutdownNow();
        }
    }
}
