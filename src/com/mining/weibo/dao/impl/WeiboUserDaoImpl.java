package com.mining.weibo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboUserDaoI;
import com.mining.weibo.model.ResultExample;
import com.mining.weibo.model.WeiboUser;
import com.mining.weibo.model.WeiboUserExample;
import com.mining.weibo.model.WeiboUserMapper;

@Repository
public class WeiboUserDaoImpl implements WeiboUserDaoI {
	@Resource
	public WeiboUserMapper wm;

	@Override
	public List<WeiboUser> get(Integer page, Integer size) {
		WeiboUserExample wue = new WeiboUserExample();
		wue.setStart(page);
		wue.setLimit(size);
		return wm.selectByExample(wue);
	}

	@Override
	public List<WeiboUser> get(String user_id) {
		WeiboUserExample wue = new WeiboUserExample();
		wue.or().andUserIdEqualTo(user_id);
		return wm.selectByExample(wue);
	}
}
