package com.mining.weibo.service;

import java.util.List;

import com.mining.weibo.model.WeiboUser;

public interface WeiboUserServiceI {
	public List<WeiboUser> get(Integer page, Integer size);

	public List<WeiboUser> get(String user_id);
}
