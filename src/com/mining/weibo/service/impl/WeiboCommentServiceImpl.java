package com.mining.weibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboCommentDaoI;
import com.mining.weibo.service.WeiboCommentServiceI;

@Repository
public class WeiboCommentServiceImpl implements WeiboCommentServiceI {
	@Resource
	public WeiboCommentDaoI wd;
}
