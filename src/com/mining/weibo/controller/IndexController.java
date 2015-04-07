package com.mining.weibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "index")
	public String statisticTopicSentiment() {
		return "core/index";
	}

	public void index() {

	}
}
