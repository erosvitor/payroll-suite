package com.ctseducare.inss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.ctseducare.inss.exception.decoder.FeignExceptionDecoder;

import feign.codec.ErrorDecoder;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
    
    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignExceptionDecoder();
    }
    
}
