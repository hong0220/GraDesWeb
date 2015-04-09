package com.mining.weibo.dao;

import java.util.List;

import com.mining.weibo.model.Result;

public interface ResultDaoI {
	public List<Result> get(String userId, Integer page, Integer size);

	public List<Result> get(String userId);
}
