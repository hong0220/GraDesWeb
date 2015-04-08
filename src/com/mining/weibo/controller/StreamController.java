package com.mining.weibo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mining.weibo.model.Weibo;
import com.mining.weibo.service.WeiboServiceI;

@Controller
public class StreamController {
	@Resource
	private WeiboServiceI ws;

	@RequestMapping(value = "stream")
	public String statisticTopicSentiment() {
		return "core/stream";
	}

	@RequestMapping(value = "get")
	public void get(HttpServletRequest request, HttpServletResponse response,
			String userId, Integer page, Integer size) {

		System.out.println(userId);
		System.out.println(page);
		System.out.println(size);

		List<Weibo> list = ws.get(userId, page, size);
		for (Weibo weibo : list) {
			System.out.println(weibo);
		}
	}
}
