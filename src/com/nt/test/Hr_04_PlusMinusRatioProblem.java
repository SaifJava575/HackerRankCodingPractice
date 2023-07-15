package com.nt.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Hr_04_PlusMinusRatioProblem {

	public static void plusMinus(List<Integer> arr) {
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

		for (int num : arr) {
			if (num > 0) {
				positiveCount++;
			} else if (num < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}

		int totalCount = arr.size();

		DecimalFormat decimalFormat = new DecimalFormat("#0.000000");

		double positiveRatio = (double) positiveCount / totalCount;
		double negativeRatio = (double) negativeCount / totalCount;
		double zeroRatio = (double) zeroCount / totalCount;

		System.out.println(decimalFormat.format(positiveRatio));
		System.out.println(decimalFormat.format(negativeRatio));
		System.out.println(decimalFormat.format(zeroRatio));
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(-1);
		list.add(-1);
		plusMinus(list);
	}

}
