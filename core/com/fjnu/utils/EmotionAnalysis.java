package com.fjnu.utils;

import java.util.HashMap;
import java.util.LinkedList;

import com.fjnu.model.EmotionValues;
import com.hyh.utils.AnsjAnalyzer;
import com.hyh.utils.MyAnalyzer;

public class EmotionAnalysis {

	// 给定文本，计算情感值(核心)
	public static void compute(HashMap<String, Integer> map, String content,
			EmotionValues ev) {
		int positiveValues = 0;
		int negativeValues = 0;
		int cur = -1;
		int i = 0;
		// 中文分词
		LinkedList<String> list = AnsjAnalyzer.ansjAnalyzer(content);

		for (String word : list) {
			i++;
			Integer index = map.get(word);
			// 词库中有这个词
			if (index != null) {
				// 是情感词：正面或者负面
				if (index != 0) {
					// 打印信息
					if (index == 1) {
						System.out.println("正面情感词=" + word + ",权值=" + index);
					} else if (index == -1) {
						System.out.println("负面情感词=" + word + ",权值=" + index);
					}

					// 否定词和情感词语不相邻
					if (i - cur != 1) {
						if (index == 1) {
							positiveValues += 1;
						} else if (index == -1) {
							negativeValues += 1;
						}
					} else { // 否定词和情感词语相邻
						if (index == 1) { // 正面情感词和否定词相连， 将正面情感词的情感极性取反。
							// 负面权值累加
							negativeValues += 1;
						} else if (index == -1) {// 负面情感词和否定词相连， 将负面情感词的情感极性取反。
							// 正面权值累加
							positiveValues += 1;
						}
					}
				} else { // 是否定词
					// 标记位置
					cur = i;
					// 打印信息
					System.out.println("否定词 " + word);
				}
			}
		}

		ev.addPositiveValues(positiveValues);
		ev.addNegativeValues(negativeValues);
	}

	// 给定文本，计算情感值(核心)
	public static void compute2(HashMap<String, Integer> map, String content,
			EmotionValues ev) {
		int positiveValues = 0;
		int negativeValues = 0;
		int fouDingCiCount = 0;
		// 中文分词
		LinkedList<String> list = AnsjAnalyzer.ansjAnalyzer(content);

		// 每个词语
		for (String word : list) {
			Integer index = map.get(word);
			// 词库中有这个词
			if (index != null) {
				// 是情感词：正面或者负面
				if (index != 0) {
					// 打印信息
					if (index == 1) {
						System.out.println("正面情感词=" + word + ",权值=" + index);
					} else if (index == -1) {
						System.out.println("负面情感词=" + word + ",权值=" + index);
					}
					if (index == 1) {
						// 否定词个数为偶数，双重否定表肯定
						if (fouDingCiCount % 2 == 0) {
							positiveValues += 1;
						} else { // 否定词个数为奇数，表否定
							// 否定词+正面=负面
							negativeValues += 1;
						}
						// 重置
						fouDingCiCount = 0;
					} else if (index == -1) {
						// 否定词个数为偶数，双重否定表肯定
						if (fouDingCiCount % 2 == 0) {
							negativeValues += 1;
						} else { // 否定词个数为奇数，表否定
							// 否定词+负面=正面
							positiveValues += 1;
						}
						// 重置
						fouDingCiCount = 0;
					}
				} else { // 是否定词
					// 标记位置
					fouDingCiCount++;
					// 打印信息
					System.out.println("否定词 " + word);
				}
			}
		}

		ev.addPositiveValues(positiveValues);
		ev.addNegativeValues(negativeValues);
	}
}
