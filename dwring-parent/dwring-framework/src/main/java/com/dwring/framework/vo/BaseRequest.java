package com.dwring.framework.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**   
 * @ClassName:  BaseRequest
 * @Description: REST API 请求结果
 * @author: zhanghaichang
 * @date:   2021年10月29日 下午9:26:44
 *
 */
@Data
@Accessors(chain = true)
public class BaseRequest<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private T body;

	public BaseRequest() {
		super();
	}

	public BaseRequest(T body) {
		super();
		this.body = body;
	}
}
