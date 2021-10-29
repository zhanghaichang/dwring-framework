package com.dwring.order.api.facade;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("alibaba-nacos-discovery-server")
public interface OrderFacade {
}
