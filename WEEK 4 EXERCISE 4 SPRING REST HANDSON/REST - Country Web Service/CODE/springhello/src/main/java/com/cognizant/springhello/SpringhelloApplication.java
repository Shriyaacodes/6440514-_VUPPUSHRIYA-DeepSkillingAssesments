package com.cognizant.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")  // Loads the XML bean from resources
public class SpringhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhelloApplication.class, args);
    }
}
