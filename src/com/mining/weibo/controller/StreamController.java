package com.mining.weibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StreamController {

	@RequestMapping(value = "statistic")
	public String statisticTopicSentiment() {
		return "core/statistics";
	}

	@RequestMapping(value = "hello")
	public void hello() {
		System.out.println("hello");
	}
}
