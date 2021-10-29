package com.dwring.service;

import com.alibaba.fastjson.JSON;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @author zhanghaichang
 */
@Slf4j
@Service
public class CustomerInfoService {


    /**
     *
     * @param request 请求体
     * @return 返回结果
     */
    public QueryCustomerInfoResponse getCustomerInfo(QueryCustomerInfoRequest request) {
        QueryCustomerInfoResponse response = new QueryCustomerInfoResponse();
        response.setId(1);
        response.setUsername(request.getUsername());
        response.setAge(18);
        response.setAddress("上海浦东新区北纬路甲一号");
        log.info("CustomerInfoService getCustomerInfo:{}", JSON.toJSONString(response));
        return response;
    }
}
