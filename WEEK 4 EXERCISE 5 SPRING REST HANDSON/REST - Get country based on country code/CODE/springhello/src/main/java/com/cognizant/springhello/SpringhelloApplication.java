package com.cognizant.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class SpringhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhelloApplication.class, args);
    }

    @EventListener
    public void onWebServerReady(WebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();
        System.out.println("✔ Running on port: " + port);
    }
}
