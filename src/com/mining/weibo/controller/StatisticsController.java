package com.mining.weibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatisticsController {

	@RequestMapping(value = "statistic")
	public String statistic() {
		return "core/statistic";
	}
}
