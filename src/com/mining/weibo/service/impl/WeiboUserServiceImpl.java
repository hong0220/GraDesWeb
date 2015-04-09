package com.mining.weibo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboUserDaoI;
import com.mining.weibo.model.WeiboUser;
import com.mining.weibo.service.WeiboUserServiceI;

@Repository
public class WeiboUserServiceImpl implements WeiboUserServiceI {
	@Resource
	public WeiboUserDaoI wd;

	public List<WeiboUser> get(Integer page, Integer size) {
		return wd.get(page, size);
	}
}
