package com.syk.publishing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    @ApiModelProperty(value = "article_ID")
    private Long articleid;

    @ApiModelProperty(value = "article_ ID of sessions")
    private Long articlesessionid;

    @ApiModelProperty(value = "article_ ID of users")
    private Long articleuserid;

    @ApiModelProperty(value = "article_Publish Time")
    private Date articletime;

    @ApiModelProperty(value = "article_Click_Count")
    private Integer articleclickcount;

    @ApiModelProperty(value = "article_publish_Is_Allowed")
    private Integer articleconsentient;

    @ApiModelProperty(value = "article_Lastest_Comment_Time")
    private Date articlelastcommenttime;

    @ApiModelProperty(value = "artcle_Title")
    private String articletitle;

    @ApiModelProperty(value = "article_Contents_With_HTML")
    private String articlecontentshtml;

    private static final long serialVersionUID = 1L;

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    public Long getArticlesessionid() {
        return articlesessionid;
    }

    public void setArticlesessionid(Long articlesessionid) {
        this.articlesessionid = articlesessionid;
    }

    public Long getArticleuserid() {
        return articleuserid;
    }

    public void setArticleuserid(Long articleuserid) {
        this.articleuserid = articleuserid;
    }

    public Date getArticletime() {
        return articletime;
    }

    public void setArticletime(Date articletime) {
        this.articletime = articletime;
    }

    public Integer getArticleclickcount() {
        return articleclickcount;
    }

    public void setArticleclickcount(Integer articleclickcount) {
        this.articleclickcount = articleclickcount;
    }

    public Integer getArticleconsentient() {
        return articleconsentient;
    }

    public void setArticleconsentient(Integer articleconsentient) {
        this.articleconsentient = articleconsentient;
    }

    public Date getArticlelastcommenttime() {
        return articlelastcommenttime;
    }

    public void setArticlelastcommenttime(Date articlelastcommenttime) {
        this.articlelastcommenttime = articlelastcommenttime;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle;
    }

    public String getArticlecontentshtml() {
        return articlecontentshtml;
    }

    public void setArticlecontentshtml(String articlecontentshtml) {
        this.articlecontentshtml = articlecontentshtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleid=").append(articleid);
        sb.append(", articlesessionid=").append(articlesessionid);
        sb.append(", articleuserid=").append(articleuserid);
        sb.append(", articletime=").append(articletime);
        sb.append(", articleclickcount=").append(articleclickcount);
        sb.append(", articleconsentient=").append(articleconsentient);
        sb.append(", articlelastcommenttime=").append(articlelastcommenttime);
        sb.append(", articletitle=").append(articletitle);
        sb.append(", articlecontentshtml=").append(articlecontentshtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}