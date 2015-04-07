package com.mining.weibo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void test() {
		System.out.println(ws.get());
	}
}
