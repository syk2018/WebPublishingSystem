package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Sessions implements Serializable {
    @ApiModelProperty(value = "session_ID")
    private Long sessionid;

    @ApiModelProperty(value = "session_Name")
    private String sessionname;

    private static final long serialVersionUID = 1L;

    public Long getSessionid() {
        return sessionid;
    }

    public void setSessionid(Long sessionid) {
        this.sessionid = sessionid;
    }

    public String getSessionname() {
        return sessionname;
    }

    public void setSessionname(String sessionname) {
        this.sessionname = sessionname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sessionid=").append(sessionid);
        sb.append(", sessionname=").append(sessionname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}