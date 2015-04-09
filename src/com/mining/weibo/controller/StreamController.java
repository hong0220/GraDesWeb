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
import com.mining.weibo.service.WeiboServiceI;
import com.mining.weibo.utils.FastJsonUtil;

@Controller
public class StreamController {
	@Resource
	private WeiboServiceI ws;

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

		List<Weibo> list = ws.get(userId, page, size);
		for (Weibo weibo : list) {
			System.out.println(weibo);
		}
		response.getWriter().write(FastJsonUtil.getJson(list));
		// map.put("vo", list);
	}
}
