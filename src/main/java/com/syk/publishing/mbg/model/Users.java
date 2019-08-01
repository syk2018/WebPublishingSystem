package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    @ApiModelProperty(value = "user_ID")
    private Long userId;

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

    @ApiModelProperty(value = "user_nickname")
    private String usernickname;

    private Integer userattention;

    private Integer userfans;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }

    public Integer getUserattention() {
        return userattention;
    }

    public void setUserattention(Integer userattention) {
        this.userattention = userattention;
    }

    public Integer getUserfans() {
        return userfans;
    }

    public void setUserfans(Integer userfans) {
        this.userfans = userfans;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", useravatar=").append(useravatar);
        sb.append(", userdescription=").append(userdescription);
        sb.append(", userregdate=").append(userregdate);
        sb.append(", userismanager=").append(userismanager);
        sb.append(", usernickname=").append(usernickname);
        sb.append(", userattention=").append(userattention);
        sb.append(", userfans=").append(userfans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}