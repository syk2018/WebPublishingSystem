package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    @ApiModelProperty(value = "user_ID")
    private Long userid;

    @ApiModelProperty(value = "user_Name")
    private String username;

    @ApiModelProperty(value = "user_Password")
    private String userpwd;

    @ApiModelProperty(value = "user_Avatar")
    private Long useravatar;

    @ApiModelProperty(value = "user_Description")
    private String userdescription;

    @ApiModelProperty(value = "user_Register_Date")
    private Date userregdate;

    @ApiModelProperty(value = "user_IsManager")
    private Integer userismanager;

    private static final long serialVersionUID = 1L;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Long getUseravatar() {
        return useravatar;
    }

    public void setUseravatar(Long useravatar) {
        this.useravatar = useravatar;
    }

    public String getUserdescription() {
        return userdescription;
    }

    public void setUserdescription(String userdescription) {
        this.userdescription = userdescription;
    }

    public Date getUserregdate() {
        return userregdate;
    }

    public void setUserregdate(Date userregdate) {
        this.userregdate = userregdate;
    }

    public Integer getUserismanager() {
        return userismanager;
    }

    public void setUserismanager(Integer userismanager) {
        this.userismanager = userismanager;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", useravatar=").append(useravatar);
        sb.append(", userdescription=").append(userdescription);
        sb.append(", userregdate=").append(userregdate);
        sb.append(", userismanager=").append(userismanager);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}