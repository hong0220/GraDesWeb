package com.mining.weibo.model.vo;

public class BingTu {
	private Integer ji = 0;
	private Integer xiao = 0;
	private Integer zhong = 0;

	public BingTu() {
	}

	public BingTu(Integer ji, Integer xiao, Integer zhong) {
		this.ji = ji;
		this.xiao = xiao;
		this.zhong = zhong;
	}

	public Integer getJi() {
		return ji;
	}

	public void setJi(Integer ji) {
		this.ji = ji;
	}

	public Integer getXiao() {
		return xiao;
	}

	public void setXiao(Integer xiao) {
		this.xiao = xiao;
	}

	public Integer getZhong() {
		return zhong;
	}

	public void setZhong(Integer zhong) {
		this.zhong = zhong;
	}

	@Override
	public String toString() {
		return "BingTu [ji=" + ji + ", xiao=" + xiao + ", zhong=" + zhong + "]";
	}
}
