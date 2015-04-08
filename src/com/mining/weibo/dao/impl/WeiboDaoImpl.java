package com.mining.weibo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboDaoI;
import com.mining.weibo.model.Weibo;
import com.mining.weibo.model.WeiboMapper;

@Repository
public class WeiboDaoImpl implements WeiboDaoI {
	@Resource
	public WeiboMapper wm;

	@Override
	public Weibo get() {
		System.out.println("get");
		return wm.selectByPrimaryKey(7722);
	}

	@Override
	public List<Weibo> get(String userId, Integer page, Integer size) {
		return null;
	}

	@Override
	public List<Weibo> getAll(String userId) {
		return null;
	}
}
