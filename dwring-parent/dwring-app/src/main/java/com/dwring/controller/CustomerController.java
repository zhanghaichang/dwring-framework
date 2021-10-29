package com.dwring.controller;

import com.alibaba.fastjson.JSON;
import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.vo.BaseRequest;
import com.dwring.framework.vo.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author zhanghaichang
 */
@Slf4j
@RestController
public class CustomerController {


    @Resource
    private CustomerFacade customerFacade;


    @PostMapping("/customerInfo")
    public BaseResponse<QueryCustomerInfoResponse> getCustomerInfo(@RequestBody BaseRequest<QueryCustomerInfoRequest> request) {
        log.info("CustomerController getCustomerInfo request:{}", JSON.toJSONString(request));
        BaseResponse<QueryCustomerInfoResponse> response = new BaseResponse<QueryCustomerInfoResponse>();
        response.setBody(customerFacade.getCustomerInfo(request).getBody());
        return response;
    }
}
