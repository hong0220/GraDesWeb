package com.mining.weibo.dao;

import java.util.List;

import com.mining.weibo.model.Weibo;

public interface WeiboDaoI {
	public List<Weibo> get(String userId, Integer page, Integer size);

	public List<Weibo> getAll(String userId, String start, String stop);
}
