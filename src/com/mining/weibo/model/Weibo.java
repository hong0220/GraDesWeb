package com.mining.weibo.model;

import java.util.Date;

public class Weibo {
	private Integer id;

	private String userId;

	private String name;

	private String content;

	private Date createtime;

	private String http;

	private Integer judge;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getHttp() {
		return http;
	}

	public void setHttp(String http) {
		this.http = http == null ? null : http.trim();
	}

	public Integer getJudge() {
		return judge;
	}

	public void setJudge(Integer judge) {
		this.judge = judge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Weibo [id=" + id + ", userId=" + userId + ", name=" + name
				+ ", content=" + content + ", createtime=" + createtime
				+ ", http=" + http + ", judge=" + judge + "]";
	}
}