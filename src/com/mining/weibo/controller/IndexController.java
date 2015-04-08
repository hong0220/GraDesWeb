package com.mining.weibo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public void analyzer(HttpServletRequest request,
			HttpServletResponse response, String input, String operatorType) {
		System.out.println("analyzer");

		if ("1".equals(operatorType)) {
			System.out.println(input);
		} else if ("2".equals(operatorType)) {
			System.out.println(input);
		} else if ("3".equals(operatorType)) {
			System.out.println(input);
		}
	}
}
