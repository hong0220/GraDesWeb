package com.mining.weibo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboDaoI;
import com.mining.weibo.model.Weibo;
import com.mining.weibo.service.WeiboServiceI;

@Repository
public class WeiboServiceImpl implements WeiboServiceI {
	@Resource
	public WeiboDaoI wd;

	@Override
	public List<Weibo> get(String userId, Integer page, Integer size) {
		return wd.get(userId, page, size);
	}

	@Override
	public List<Weibo> getAll(String start, String stop) {
		return wd.getAll(start, stop);
	}
}
