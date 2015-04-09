package com.mining.weibo.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.ResultDaoI;
import com.mining.weibo.model.Result;
import com.mining.weibo.model.ResultExample;
import com.mining.weibo.model.ResultMapper;

@Repository
public class ResultDaoImpl implements ResultDaoI {
	@Resource
	public ResultMapper rm;

	@Override
	public List<Result> get(String userId, Integer page, Integer size) {
		ResultExample re = new ResultExample();
		// re.setStart(page);
		// re.setLimit(size);
		re.or().andUserIdEqualTo(userId);
		return rm.selectByExample(re);
	}
}
