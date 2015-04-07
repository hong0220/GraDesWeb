package com.mining.weibo.model;

import java.util.Date;

public class Weibo {
	private Integer id;

	private String userId;

	private String content;

	private Date createtime;

	private Integer page;

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

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Weibo [id=" + id + ", userId=" + userId + ", content="
				+ content + ", createtime=" + createtime + ", page=" + page
				+ "]";
	}
}