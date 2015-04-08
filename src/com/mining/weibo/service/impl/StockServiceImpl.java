package com.mining.weibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.StockDaoI;
import com.mining.weibo.service.StockServiceI;

@Repository
public class StockServiceImpl implements StockServiceI {
	@Resource
	public StockDaoI wd;
}
