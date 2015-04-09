package com.hyh.utils;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.Analysis;
import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * 标注的分词方式
 */
public class AnsjAnalyzer {
	public static LinkedList<String> ansjAnalyzer(String content) {
		Analysis udf = new ToAnalysis(new StringReader(content));
		Term term = null;
		LinkedList<String> list = new LinkedList<String>();
		try {
			while ((term = udf.next()) != null) {
				list.add(term.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}