package com.dwring.framework.vo;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName:  BaseResponse
 * @Description: REST API 返回结果
 * @author: zhanghaichang
 * @date:   2019年10月15日 下午9:26:44
 *
 */
@Data
@Accessors(chain = true)
public class BaseResponse<T> implements Serializable {
//
	private static final long serialVersionUID = 1L;
//
//	private static final int SUCCESS = EnumUtils.ResponseCode.SUCCESS.getCode();
//	private static final int FAIL = EnumUtils.ResponseCode.FAIL.getCode();
//	private String msg = EnumUtils.ResponseCode.SUCCESS.getMessage();
//	private int code = SUCCESS;
	private T body;

	public BaseResponse() {
		super();
	}

	public BaseResponse(T body) {
		super();
		this.body = body;
	}
//
//	public BaseResponse(String msg) {
//		super();
//		this.msg = msg;
//	}
//
//	public BaseResponse(int code, String msg) {
//		super();
//		if (StringUtils.isNoneBlank(msg)) {
//			this.msg = msg;
//		} else {
//			this.msg = (FAIL == code) ? EnumUtils.ResponseCode.FAIL.getMessage() : msg;
//		}
//		this.code = code;
//	}
//
//	public BaseResponse(int code, String msg, T data) {
//		super();
//		this.code = code;
//		this.msg = msg;
//		this.data = data;
//	}
//
//	public BaseResponse(Throwable e) {
//		super();
//		this.msg = e.toString();
//		this.code = FAIL;
//	}
//
//	public static BaseResponse<?> fail() {
//		return new BaseResponse<Object>(EnumUtils.ResponseCode.FAIL.getCode(), null);
//	}
//
//	public static BaseResponse<?> fail(String msg) {
//		return new BaseResponse<Object>(EnumUtils.ResponseCode.FAIL.getCode(), msg);
//	}
//
//
//	public static BaseResponse<?> fail(String msg,Object data) {
//		return new BaseResponse<Object>(EnumUtils.ResponseCode.FAIL.getCode(), msg,data);
//	}
//
//	public static BaseResponse<?> success(Object data) {
//		return new BaseResponse<Object>(EnumUtils.ResponseCode.SUCCESS.getCode(),
//				EnumUtils.ResponseCode.SUCCESS.getMessage(), data);
//	}

}
