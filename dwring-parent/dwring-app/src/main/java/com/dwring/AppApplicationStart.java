package com.dwring;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhanghaichang
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AppApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(AppApplicationStart.class, args);
    }

}
