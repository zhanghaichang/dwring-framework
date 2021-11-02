package com.dwring.controller;

import com.alibaba.fastjson.JSON;
import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.enums.ResponseCodeEnum;
import com.dwring.framework.vo.HttpRequest;
import com.dwring.framework.vo.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
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
    public HttpResponse<QueryCustomerInfoResponse> getCustomerInfo(@RequestBody HttpRequest<QueryCustomerInfoRequest> request) {
        log.info("CustomerController getCustomerInfo request:{}", JSON.toJSONString(request));
        HttpResponse<QueryCustomerInfoResponse> response = new HttpResponse<QueryCustomerInfoResponse>();
        response.setBody(customerFacade.getCustomerInfo(request.getBody()).getBody());
        response.setCode(ResponseCodeEnum.SUCCESS.getCode());
        response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());
        return response;
    }

    @ApiOperation(value = "获取用户名称", notes = "通过配置中心查询用户名")
    @GetMapping("/customerInfo/name")
    public HttpResponse<String> getCustomerName() {
        HttpResponse<String> response = new HttpResponse<String>();
        response.setBody(name);
        response.setCode(ResponseCodeEnum.SUCCESS.getCode());
        response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());
        return response;
    }
}
