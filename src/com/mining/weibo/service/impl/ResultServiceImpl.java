package com.mining.weibo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.ResultDaoI;
import com.mining.weibo.model.Result;
import com.mining.weibo.service.ResultServiceI;

@Repository
public class ResultServiceImpl implements ResultServiceI {
	@Resource
	public ResultDaoI rd;

	@Override
	public List<Result> get(String userId, Integer page, Integer size) {
		return rd.get(userId, page, size);
	}

	@Override
	public List<Result> get(String userId) {
		return rd.get(userId);
	}
}
