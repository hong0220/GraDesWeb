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
		System.out.println(input);
		System.out.println(operatorType);
	}

	/*
	 * @RequestMapping(value = "analyzer2") public void
	 * analyzer2(HttpServletRequest request, HttpServletResponse response,
	 * String input, String operatorType) { System.out.println("analyzer2");
	 * System.out.println(input); System.out.println(operatorType); }
	 * 
	 * @RequestMapping(value = "analyzer3") public void
	 * analyzer3(HttpServletRequest request, HttpServletResponse response,
	 * String input, String operatorType) { System.out.println("analyzer3");
	 * System.out.println(input); System.out.println(operatorType); }
	 */
}
