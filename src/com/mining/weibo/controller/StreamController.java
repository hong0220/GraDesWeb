package com.mining.weibo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mining.weibo.service.WeiboServiceI;

@Controller
public class StreamController {
	@Resource
	private WeiboServiceI ws;

	@RequestMapping(value = "stream")
	public String statisticTopicSentiment() {
		return "core/stream";
	}

	@RequestMapping(value = "test")
	public void get(HttpServletRequest request, HttpServletResponse response,
			String userId, Integer page, Integer size) {
		System.out.println(ws.get(userId, page, size));
	}
}
