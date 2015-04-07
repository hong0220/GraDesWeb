package com.mining.weibo.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboDaoI;
import com.mining.weibo.model.Weibo;
import com.mining.weibo.service.WeiboServiceI;

@Repository
public class WeiboServiceImpl implements WeiboServiceI {
	@Resource
	public WeiboDaoI wd;

	@Override
	public Weibo get() {
		System.out.println("get");
		return wd.get();
	}
}
