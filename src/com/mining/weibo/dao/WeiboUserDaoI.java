package com.mining.weibo.dao;

import java.util.List;

import com.mining.weibo.model.WeiboUser;

public interface WeiboUserDaoI {
	public List<WeiboUser> get(Integer page, Integer size);
}
