package com.dwring.controller;

import com.alibaba.fastjson.JSON;
import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.enums.ResponseCodeEnum;
import com.dwring.framework.vo.RestfulResponse;
import com.dwring.service.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author zhanghaichang
 */
@Slf4j
@RestController
public class CustomerFacadeImpl implements CustomerFacade {


    @Resource
    private CustomerInfoService customerInfoService;

    /**
     *
     * @param request the request
     * @return 结果
     */
    @Override
    public RestfulResponse<QueryCustomerInfoResponse> getCustomerInfo(@RequestBody QueryCustomerInfoRequest request) {
        log.info("CustomerInfoService getCustomerInfo request:{}", JSON.toJSONString(request));
        RestfulResponse<QueryCustomerInfoResponse> response = new RestfulResponse<QueryCustomerInfoResponse>();
        response.setBody(customerInfoService.getCustomerInfo(request));
        response.setCode(ResponseCodeEnum.SUCCESS.getCode());
        response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());
        return response;
    }
}
