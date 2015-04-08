package com.fjnu.model;

/**
 * 功能描述 ：情感词权值
 */
public class EmotionValues {
	private int positiveValues;
	private int negativeValues;

	public EmotionValues() {
		positiveValues = 0;
		negativeValues = 0;
	}

	public int getPositiveValues() {
		return positiveValues;
	}

	public void setPositiveValues(int positiveValues) {
		this.positiveValues = positiveValues;
	}

	public int getNegativeValues() {
		return negativeValues;
	}

	public void setNegativeValues(int negativeValues) {
		this.negativeValues = negativeValues;
	}

	public void addPositiveValues(int values) {
		positiveValues += values;
	}

	public void addNegativeValues(int values) {
		negativeValues += values;
	}
}
