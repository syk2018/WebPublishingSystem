package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Comments implements Serializable {
    @ApiModelProperty(value = "comment_ID")
    private Long commentid;

    @ApiModelProperty(value = "comment_ ID of article include the comment")
    private Long commentaid;

    @ApiModelProperty(value = "comment_ ID of user sent it")
    private Long commentuid;

    @ApiModelProperty(value = "comment_Publish_Time")
    private Date commenttime;

    @ApiModelProperty(value = "comment_Content")
    private String commentcontent;

    private static final long serialVersionUID = 1L;

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public Long getCommentaid() {
        return commentaid;
    }

    public void setCommentaid(Long commentaid) {
        this.commentaid = commentaid;
    }

    public Long getCommentuid() {
        return commentuid;
    }

    public void setCommentuid(Long commentuid) {
        this.commentuid = commentuid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentid=").append(commentid);
        sb.append(", commentaid=").append(commentaid);
        sb.append(", commentuid=").append(commentuid);
        sb.append(", commenttime=").append(commenttime);
        sb.append(", commentcontent=").append(commentcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}