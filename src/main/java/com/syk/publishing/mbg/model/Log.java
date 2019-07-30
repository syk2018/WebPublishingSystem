package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    @ApiModelProperty(value = "log_ID")
    private Long logId;

    @ApiModelProperty(value = "user_ID")
    private Long userId;

    @ApiModelProperty(value = "log_Time")
    private Date logtime;

    @ApiModelProperty(value = "Lastest_IP_Address of user to login")
    private String loglastipadress;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public String getLoglastipadress() {
        return loglastipadress;
    }

    public void setLoglastipadress(String loglastipadress) {
        this.loglastipadress = loglastipadress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", userId=").append(userId);
        sb.append(", logtime=").append(logtime);
        sb.append(", loglastipadress=").append(loglastipadress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}