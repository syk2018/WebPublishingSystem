package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Following implements Serializable {
    @ApiModelProperty(value = "user_id PRIMARY KEY")
    private Long userId;

    @ApiModelProperty(value = "attention_user_id PRIMARY KEY")
    private Long followingUserId;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFollowingUserId() {
        return followingUserId;
    }

    public void setFollowingUserId(Long followingUserId) {
        this.followingUserId = followingUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", followingUserId=").append(followingUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}