package com.mining.weibo.dao.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.mining.weibo.dao.WeiboDaoI;
import com.mining.weibo.model.Weibo;
import com.mining.weibo.model.WeiboExample;
import com.mining.weibo.model.WeiboMapper;
import com.mining.weibo.utils.DateTimeUtil;

@Repository
public class WeiboDaoImpl implements WeiboDaoI {
	@Resource
	public WeiboMapper wm;

	@Override
	public List<Weibo> get(String userId, Integer page, Integer size) {
		WeiboExample we = new WeiboExample();
		we.setStart(page);
		we.setLimit(size);
		we.or().andUserIdEqualTo(userId);
		return wm.selectByExample(we);
	}

	@Override
	public List<Weibo> getAll(String timeStart, String timeStop) {
		WeiboExample we = new WeiboExample();

		try {
			// 开始时间
			Date start = DateTimeUtil.formatStr(timeStart + " 00:00:00",
					"yyyy-MM-dd HH:mm:ss");
			// 结束时间
			Date stop = DateTimeUtil.formatStr(timeStop + " 23:59:59",
					"yyyy-MM-dd HH:mm:ss");
			we.or().andCreatetimeGreaterThanOrEqualTo(start);
			we.or().andCreatetimeLessThanOrEqualTo(stop);
			return wm.selectByExample(we);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
