package com.dwring.framework.enums;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author zhanghaichang
 */

public enum ResponseCodeEnum {

    SUCCESS("200", "成功"),

    FAIL("500", "失败");

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
