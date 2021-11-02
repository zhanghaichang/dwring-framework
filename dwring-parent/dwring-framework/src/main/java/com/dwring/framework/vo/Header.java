package com.dwring.framework.vo;

import java.io.Serializable;

/**
 * @author zhanghaichang
 */
public class Header implements Serializable {

    private String userId;

    private String sessionId;

    private String glbSeqNo;

    private String serviceId;

    private String tranCode;

    private String sourceType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getGlbSeqNo() {
        return glbSeqNo;
    }

    public void setGlbSeqNo(String glbSeqNo) {
        this.glbSeqNo = glbSeqNo;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }



}
