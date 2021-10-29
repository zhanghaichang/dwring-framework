package com.dwring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplicationStart.class, args);
    }

}
