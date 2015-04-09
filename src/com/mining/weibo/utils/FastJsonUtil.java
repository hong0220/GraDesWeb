package com.mining.weibo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class FastJsonUtil {
	// 生成json
	public static String getJson(Object obj) {
		return JSON.toJSONString(obj);
	}

	// 解析json
	public static <T> T getObject(String jsonString, Class<T> cls) {
		T t = null;
		try {
			t = JSON.parseObject(jsonString, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	// 解析json
	public static <T> List<T> getObjects(String jsonString, Class<T> cls) {
		List<T> list = new ArrayList<T>();
		try {
			list = JSON.parseArray(jsonString, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 解析json
	public static List<Map<String, Object>> listKeyMaps(String jsonString) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			list = JSON.parseObject(jsonString,
					new TypeReference<List<Map<String, Object>>>() {
					});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
