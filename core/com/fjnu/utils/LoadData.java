package com.fjnu.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 加载情感词库到 HashMap
 */
public class LoadData {
	private HashMap<String, Integer> map;

	public LoadData(HashMap<String, Integer> map) {
		this.map = map;
	}

	// 得到情感词表和否定词表
	public void dataToMap() {
		readLine("word/否定词表.txt", 0); // 20
		readLine("word/负面评价词语中文.txt", -1); // 3116
		readLine("word/负面情感词语中文.txt", -1); // 1254
		readLine("word/正面评价词语中文.txt", 1); // 3730
		readLine("word/正面情感词语中文.txt", 1); // 836
		// System.out.println(map.size()); // 8746 过滤掉重复
	}

	public void dataToMap2() {
		readLine("dic/NTUSD/否定词表.txt", 0);
		readLine("dic/NTUSD/NTUSD_negative_simplified.txt", -1);
		readLine("dic/NTUSD/NTUSD_positive_simplified.txt", 1);
	}

	public void dataToMap3() {
		// readLine("dic/net/deny/deny.txt", 0);
		// System.out.println("-----------");

		// readLine("dic/net/negative/new.txt", -1);
		// System.out.println("-----------");
		// readLine("dic/net/negative/negative.txt", -1);

		System.out.println("-----------");
		readLine("dic/net/positive/new.txt", 1);
		System.out.println("-----------");
		readLine("dic/net/positive/positive.txt", 1);
		System.out.println("-----------");
		System.out.println(map.size());
	}

	// 读取文本文件内容到HashMap中
	public void readLine(String path, Integer value) {
		int start = map.size();
		FileInputStream fis;
		int count = 0;
		try {
			fis = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			while ((line = br.readLine()) != null) {
				// 注意这边
				line = line.trim();
				System.out.print(map.get(line) != null ? line + "," : "");
				map.put(line, value);
				count++;
			}
			fis.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int stop = map.size();
		System.out.println(count);
		System.out.println("stop-start:" + (stop - start));
	}

	public static void main(String[] args) {
		new LoadData(new HashMap<String, Integer>()).dataToMap3();
	}
}
