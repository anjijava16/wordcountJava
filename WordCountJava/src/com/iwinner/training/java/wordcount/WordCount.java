package com.iwinner.training.java.wordcount;

import java.util.HashMap;


import java.util.Map;

public class WordCount {
	public static void main(String[] args) {

		String strName = "I am Hadoop Developer am I Hadoop Developer We are working Hadoop POC";

		String str[] = strName.split("\\s+");
		Map<String, Integer> word = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {
			String ch = str[i];
			if (word.containsKey(ch)) {
				word.put(ch, word.get(ch) + 1);
			} else {
				word.put(ch, 1);
			}

		}
		System.out.println(word);
	}
}