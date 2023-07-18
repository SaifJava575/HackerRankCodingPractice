package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_13_BreakingTheRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> list = new ArrayList<>();
		int minScores = scores.get(0);
		int maxScores = scores.get(0);
		int minCount = 0;
		int maxCount = 0;
		for (int i = 1; i < scores.size(); i++) {
			if (minScores < scores.get(i)) {
				minScores = scores.get(i);
				minCount++;
			} else if (maxScores > scores.get(i)) {
				maxScores = scores.get(i);
				maxCount++;
			}
		}
		list.add(maxCount);
		list.add(minCount);
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(24);
		list.add(10);
		list.add(24);

		List<Integer> response = breakingRecords(list);
		System.out.println("Maria performence most case and Least Case " + response);
	}

}
