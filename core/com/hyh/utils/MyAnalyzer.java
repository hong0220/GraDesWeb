package com.hyh.utils;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * 采用了特有的“正向迭代最细粒度切分算法“，具有60万字/秒的高速处理能力。
 */
public class MyAnalyzer {

	public static LinkedList<String> IK_Analyzer(String content) {
		System.out.print("中文分词结果：");
		LinkedList<String> list = new LinkedList<String>();
		// 创建分词对象
		Analyzer anal = new IKAnalyzer(true);
		StringReader reader = new StringReader(content);
		// 分词
		TokenStream ts = anal.tokenStream("", reader);
		CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
		// 遍历分词数据
		try {
			while (ts.incrementToken()) {
				System.out.print(term.toString() + " ");
				list.add(term.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
		System.out.println();
		return list;
	}
}
