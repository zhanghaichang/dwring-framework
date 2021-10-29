package com.dwring.customer.api.facade.hystrix;

import com.dwring.customer.api.facade.CustomerFacade;
import com.dwring.customer.api.reponse.QueryCustomerInfoResponse;
import com.dwring.customer.api.request.QueryCustomerInfoRequest;
import com.dwring.framework.vo.BaseRequest;
import com.dwring.framework.vo.BaseResponse;
import org.springframework.stereotype.Component;

/**
 * @author zhanghaichang
 */
@Component
public class CustomerFacadeHystrix implements CustomerFacade {


    @Override
    public BaseResponse<QueryCustomerInfoResponse> getCustomerInfo(BaseRequest<QueryCustomerInfoRequest> request) {
        BaseResponse<QueryCustomerInfoResponse> response = new BaseResponse<QueryCustomerInfoResponse>();
        QueryCustomerInfoResponse body = new QueryCustomerInfoResponse();
        body.setAddress("系统异常！");
        response.setBody(body);
        return response;
    }
}
