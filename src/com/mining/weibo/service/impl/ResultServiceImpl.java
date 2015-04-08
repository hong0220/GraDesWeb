package com.mining.weibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.ResultDaoI;
import com.mining.weibo.service.ResultServiceI;

@Repository
public class ResultServiceImpl implements ResultServiceI {
	@Resource
	public ResultDaoI rd;
}
