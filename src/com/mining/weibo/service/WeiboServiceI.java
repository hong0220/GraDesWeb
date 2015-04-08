package com.mining.weibo.service;

import java.util.List;

import com.mining.weibo.model.Weibo;

public interface WeiboServiceI {
	public List<Weibo> get(String userId, Integer page, Integer size);
}
