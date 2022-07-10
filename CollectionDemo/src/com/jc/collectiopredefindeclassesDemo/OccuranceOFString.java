package com.jc.collectiopredefindeclassesDemo;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOFString {
	public static void main(String[] args) {
		String nam = "india is my country. india is beautiful".toLowerCase();
		Map<String, Integer> occ = new HashMap<>();
		String []words=nam.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (occ.containsKey(words[i])) {
				occ.put(words[i], occ.get(words[i]) + 1);
			} else {
				occ.put(words[i], 1);
			}
		}

		for (Map.Entry<String, Integer> entry : occ.entrySet()) {
			System.out.println(entry);

		}
	}

}
