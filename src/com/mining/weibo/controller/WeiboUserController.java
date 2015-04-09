package com.mining.weibo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mining.weibo.model.WeiboUser;
import com.mining.weibo.service.WeiboUserServiceI;

@Controller
public class WeiboUserController {
	@Resource
	private WeiboUserServiceI wus;

	@RequestMapping(value = "home")
	public String get(HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> map, Integer page, Integer size)
			throws IOException {
		List<WeiboUser> list = wus.get(0, 10);
		for (WeiboUser weiboUser : list) {
			System.out.println(weiboUser);
		}
		map.put("vo", list);
		return "core/home";
	}
}
