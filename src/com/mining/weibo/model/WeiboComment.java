package com.mining.weibo.model;

import java.util.Date;

public class WeiboComment {
    private Integer id;

    private String cid;

    private String userId;

    private String content;

    private Date time;

    private String source;

    private String weiboid;

    private String http;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getWeiboid() {
        return weiboid;
    }

    public void setWeiboid(String weiboid) {
        this.weiboid = weiboid == null ? null : weiboid.trim();
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http == null ? null : http.trim();
    }
}