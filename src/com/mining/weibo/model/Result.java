package com.mining.weibo.model;

import java.util.Date;

public class Result {
	private Integer id;

	private Date day;

	private String userId;

	private Float positive;

	private Float negative;

	private Float riseorfall;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Float getPositive() {
		return positive;
	}

	public void setPositive(Float positive) {
		this.positive = positive;
	}

	public Float getNegative() {
		return negative;
	}

	public void setNegative(Float negative) {
		this.negative = negative;
	}

	public Float getRiseorfall() {
		return riseorfall;
	}

	public void setRiseorfall(Float riseorfall) {
		this.riseorfall = riseorfall;
	}
}