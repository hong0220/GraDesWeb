package com.mining.weibo.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mining.weibo.model.Result;
import com.mining.weibo.service.ResultServiceI;
import com.mining.weibo.utils.FastJsonUtil;

@Controller
public class StatisticsController {
	@Resource
	public ResultServiceI rs;

	@RequestMapping(value = "statistic")
	public String statistic(HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> map, String userId)
			throws IOException {
		map.put("userId", userId);
		return "core/statistic";
	}

	@RequestMapping(value = "total")
	public void get(HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> map, String userId) throws IOException {
		List<Result> list = rs.get(userId);
		for (Result result : list) {
			result.setDay(result.getDay());
		}
		response.getWriter().write(FastJsonUtil.getJson(list));
	}
}
