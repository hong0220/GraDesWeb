package com.mining.weibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "index")
	public String index() {
		return "core/index";
	}

	@RequestMapping(value = "index2")
	public String index2() {
		return "core/index2";
	}

	@RequestMapping(value = "index3")
	public String index3() {
		return "core/index3";
	}

	@RequestMapping(value = "analyzer")
	public void analyzer() {

	}

	@RequestMapping(value = "analyzer2")
	public void analyzer2() {

	}

	@RequestMapping(value = "analyzer3")
	public void analyzer3() {

	}
}
