package com.mining.weibo.service;

import java.util.List;

import com.mining.weibo.model.Result;

public interface ResultServiceI {
	public List<Result> get(String userId, Integer page, Integer size);

	public List<Result> get(String userId);
}
