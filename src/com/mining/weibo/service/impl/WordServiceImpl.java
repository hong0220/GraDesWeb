package com.mining.weibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WordDaoI;
import com.mining.weibo.service.WordServiceI;

@Repository
public class WordServiceImpl implements WordServiceI {
	@Resource
	public WordDaoI wd;
}
