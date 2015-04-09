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
			HttpServletResponse response, Map<String, Object> map)
			throws IOException {

		/*
		 * map.put("day", new String[] { "3月1号", "3月2号", "3月3号", "3月4号", "3月5号",
		 * "3月6号", "3月7号", "3月8号", "3月9号", "3月10号", "3月11号", "3月12号", "3月1号",
		 * "3月2号", "3月3号", "3月4号", "3月5号", "3月6号", "3月7号", "3月8号", "3月9号",
		 * "3月10号", "3月11号", "3月12号" });
		 */
		/*List<Result> list = rs.get("3286692011", 1, 5);
		for (Result result : list) {
			System.out.println(result);
		}*/
		return "core/statistic";
	}

	@RequestMapping(value = "total")
	public void get(HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> map) throws IOException {
		List<Result> list = rs.get("3286692011", 1, 5);
		List<Result> resultList = new LinkedList<Result>();
		for (Result result : list) {
			result.setDay(result.getDay());
			resultList.add(result);
		}
		response.getWriter().write(FastJsonUtil.getJson(list));
	}
}
