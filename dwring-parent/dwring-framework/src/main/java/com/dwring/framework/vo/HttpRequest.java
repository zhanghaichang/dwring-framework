package com.dwring.framework.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName:  HttpRequest
 * @Description: HTTP 请求结果
 * @author: zhanghaichang
 * @date: 2021年10月29日 下午9:26:44
 */
@Data
@Accessors(chain = true)
public class HttpRequest<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Header header = new Header();

    private T body;

    public HttpRequest() {
        super();
    }

    public HttpRequest(Header header, T body) {
        super();
        this.header=header;
        this.body = body;
    }
}
