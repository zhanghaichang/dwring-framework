package com.dwring.customer.api.facade.fallback;

import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.vo.RestfulResponse;
import org.springframework.stereotype.Component;

/**
 * @author zhanghaichang
 */
@Component
public class CustomerFacadeHystrix implements CustomerFacade {


    @Override
    public RestfulResponse<QueryCustomerInfoResponse> getCustomerInfo(QueryCustomerInfoRequest request) {
        RestfulResponse<QueryCustomerInfoResponse> response = new RestfulResponse<QueryCustomerInfoResponse>();
        QueryCustomerInfoResponse body = new QueryCustomerInfoResponse();
        body.setAddress("系统异常！");
        response.setBody(body);
        return response;
    }
}
