package com.mining.weibo.service;

import com.mining.weibo.model.Weibo;

public interface WeiboServiceI {
	public Weibo get(String userId, Integer page, Integer size);
}
