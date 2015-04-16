package com.mining.weibo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mining.weibo.model.Weibo;
import com.mining.weibo.model.WeiboUser;
import com.mining.weibo.model.vo.BingTu;
import com.mining.weibo.service.WeiboServiceI;
import com.mining.weibo.service.WeiboUserServiceI;
import com.mining.weibo.utils.FastJsonUtil;

@Controller
public class StreamController {
	@Resource
	private WeiboServiceI ws;
	@Resource
	private WeiboUserServiceI wus;

	@RequestMapping(value = "stream")
	public String stream(HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> map, String userId)
			throws IOException {
		map.put("userId", userId);
		return "core/stream";
	}

	@RequestMapping(value = "get")
	public void get(HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> map, String userId, Integer page, Integer size)
			throws IOException {

		System.out.println(userId);
		System.out.println(page);
		System.out.println(size);

		List<WeiboUser> weiboUserList = wus.get(userId);
		System.out.println("name:" + weiboUserList.get(0).getName());

		List<Weibo> list = ws.get(userId, page, size);
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getUserId());

			list.get(i).setName(weiboUserList.get(0).getName());
		}
		response.getWriter().write(FastJsonUtil.getJson(list));
		// map.put("vo", list);
	}

	@RequestMapping(value = "bingTu")
	public void get(HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> map, String userId) throws IOException {
		List<Weibo> list = ws.getAll(userId, "2014-05-01", "2014-05-30");
		System.out.println(list.size());
		Integer ji = 0;
		Integer xiao = 0;
		Integer zhong = 0;
		for (Weibo weibo : list) {
			if (weibo.getJudge() == 1) {
				ji++;
			} else if (weibo.getJudge() == 0) {
				zhong++;
			} else if (weibo.getJudge() == -1) {
				xiao++;
			}
		}
		BingTu bt = new BingTu(ji, xiao, zhong);
		response.getWriter().write(FastJsonUtil.getJson(bt));
	}
}
