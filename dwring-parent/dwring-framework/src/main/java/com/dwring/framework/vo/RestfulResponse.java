package com.dwring.framework.vo;

import com.dwring.framework.enums.ResponseCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;
import java.io.Serializable;

/**
 * @ClassName:  RestfulResponse
 * @Description: REST API 返回结果
 * @author: zhanghaichang
 * @date:   2019年10月15日 下午9:26:44
 *
 */
@Data
@Accessors(chain = true)
public class RestfulResponse<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String SUCCESS = ResponseCodeEnum.SUCCESS.getCode();

	private static final String FAIL = ResponseCodeEnum.FAIL.getCode();

	private String msg;

	private String code;

	private T body;


	public RestfulResponse() {
		super();
	}

	public RestfulResponse(T body) {
		super();
		this.body = body;
	}

	public RestfulResponse(String msg) {
		super();
		this.msg = msg;
	}


	public RestfulResponse(String code, String msg) {
		super();
		if (StringUtils.isNoneBlank(msg)) {
			this.msg = msg;
		} else {
			this.msg = (FAIL.equals(code)) ? ResponseCodeEnum.FAIL.getMsg() : msg;
		}
		this.code = code;
	}

	public RestfulResponse(String code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.body = data;
	}

	public RestfulResponse(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}

	public RestfulResponse(T code, T o) {
	}

	public static HttpResponse<?> fail() {
		return new HttpResponse<Object>(ResponseCodeEnum.FAIL.getCode(), null);
	}

	public static HttpResponse<?> fail(String msg) {
		return new HttpResponse<Object>(ResponseCodeEnum.FAIL.getCode(), msg);
	}


	public static HttpResponse<?> fail(String msg, Object data) {
		return new HttpResponse<Object>(ResponseCodeEnum.FAIL.getCode(), msg, data);
	}

	public static HttpResponse<?> success(Object data) {
		return new HttpResponse<Object>(ResponseCodeEnum.SUCCESS.getCode(),
				ResponseCodeEnum.SUCCESS.getMsg(), data);
	}
}
