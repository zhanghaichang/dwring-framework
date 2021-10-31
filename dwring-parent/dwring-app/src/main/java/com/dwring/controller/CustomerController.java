package com.dwring.controller;

import com.alibaba.fastjson.JSON;
import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.vo.BaseRequest;
import com.dwring.framework.vo.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * @author zhanghaichang
 */
@Slf4j
@Api(tags = "用户模块")
@RestController
@RefreshScope
public class CustomerController {


    @Resource
    private CustomerFacade customerFacade;


    @Value("${name:}")
    private String name;

    @ApiOperation(value = "获取用户详细信息", notes = "通过用户名查询用户信息")
    @PostMapping("/customerInfo")
    public BaseResponse<QueryCustomerInfoResponse> getCustomerInfo(@RequestBody BaseRequest<QueryCustomerInfoRequest> request) {
        log.info("CustomerController getCustomerInfo request:{}", JSON.toJSONString(request));
        BaseResponse<QueryCustomerInfoResponse> response = new BaseResponse<QueryCustomerInfoResponse>();
        response.setBody(customerFacade.getCustomerInfo(request).getBody());
        return response;
    }

    @ApiOperation(value = "获取用户名称", notes = "通过配置中心查询用户名")
    @GetMapping("/customerInfo/name")
    public BaseResponse<String> getCustomerName() {
        BaseResponse<String> response = new BaseResponse<String>();
        response.setBody(name);
        return response;
    }
}
