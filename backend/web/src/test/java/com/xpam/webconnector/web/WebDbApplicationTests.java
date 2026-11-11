package com.xpam.webconnector.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import java.io.IOException;
import java.nio.file.Files;

// Starts the whole Spring context without the services it has in production: mock.enable keeps the
// startup hooks from calling Wisp over gRPC (scanRemainReplays, task stream), and the driver path points
// at an empty directory because ./drivers only exists at the repository root and in the image.
// WebSocketConfig needs a real servlet container, so Tomcat runs on a random loopback port.
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"mock.enable=true", "server.address=127.0.0.1"}
)
class WebDbApplicationTests {

    @DynamicPropertySource
    static void driverPath(DynamicPropertyRegistry registry) throws IOException {
        var drivers = Files.createTempDirectory("webconnector-drivers");
        drivers.toFile().deleteOnExit();
        registry.add("driver.driver-path", drivers::toString);
    }

    @Test
    void contextLoads() {
    }

}
