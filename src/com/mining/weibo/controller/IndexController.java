package com.mining.weibo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ansj.splitWord.analysis.ToAnalysis;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fjnu.model.EmotionValues;
import com.fjnu.utils.EmotionAnalysis;
import com.fjnu.utils.LoadData;
import com.hyh.utils.MyAnalyzer;

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
			HttpServletResponse response, String input, String operatorType)
			throws IOException {
		System.out.println("analyzer");
		if (operatorType.equals("1")) {
			LinkedList<String> list = MyAnalyzer.IK_Analyzer(input);
			StringBuffer sb = new StringBuffer();
			for (String str : list) {
				sb.append(str + "\\");
			}
			response.getWriter().write(sb.toString());
		} else if (operatorType.equals("2")) {
			List paser = ToAnalysis.parse(input);
			response.getWriter().write(paser.toString());
		} else if (operatorType.equals("3")) {
			// 加载词库数据到HashMap
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			new LoadData(map).dataToMap3();
			EmotionValues ev = new EmotionValues();
			EmotionAnalysis.compute(map, input, ev);
			if (ev.getPositiveValues() > Math.abs(ev.getNegativeValues())) {
				response.getWriter().write("积极情感");
			} else if (ev.getPositiveValues() < Math
					.abs(ev.getNegativeValues())) {
				response.getWriter().write("消极情感");
			} else if (ev.getPositiveValues() == Math.abs(ev
					.getNegativeValues())) {
				response.getWriter().write("中性情感");
			}
		}
	}
}
