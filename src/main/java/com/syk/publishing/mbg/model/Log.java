package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    @ApiModelProperty(value = "log_ID")
    private Long logid;

    @ApiModelProperty(value = "user_ID")
    private Long userid;

    @ApiModelProperty(value = "log_Time")
    private Date logtime;

    @ApiModelProperty(value = "Lastest_IP_Address of user to login")
    private String loglastipadress;

    private static final long serialVersionUID = 1L;

    public Long getLogid() {
        return logid;
    }

    public void setLogid(Long logid) {
        this.logid = logid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
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
        sb.append(", logid=").append(logid);
        sb.append(", userid=").append(userid);
        sb.append(", logtime=").append(logtime);
        sb.append(", loglastipadress=").append(loglastipadress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}