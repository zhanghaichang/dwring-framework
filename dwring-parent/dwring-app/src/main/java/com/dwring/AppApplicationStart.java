package com.dwring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhanghaichang
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AppApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(AppApplicationStart.class, args);
    }

}
