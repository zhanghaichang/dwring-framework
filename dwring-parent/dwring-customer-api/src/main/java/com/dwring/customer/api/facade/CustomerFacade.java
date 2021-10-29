package com.dwring.customer.api.facade;

import com.dwring.customer.api.facade.hystrix.CustomerFacadeHystrix;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.vo.BaseRequest;
import com.dwring.framework.vo.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @author zhanghaichang
 */
@FeignClient(value = "topcheer-micros-service-customer", fallback = CustomerFacadeHystrix.class)
public interface CustomerFacade {

    /**
     * 查询客户信息
     * @param request the request
     * @return 返回 customer info
     */
    @PostMapping("/customerInfo")
    BaseResponse<QueryCustomerInfoResponse> getCustomerInfo(@RequestBody BaseRequest<QueryCustomerInfoRequest> request);
}
