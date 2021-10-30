package com.dwring.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhanghaichang
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplicationStart.class, args);
    }
}