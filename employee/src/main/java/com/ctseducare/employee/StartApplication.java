package com.ctseducare.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
