package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hr_06_MinMaxSumProblem {

	public static void miniMaxSum(List<Integer> numbers) {
		Collections.sort(numbers);
		long minSum = 0;
		long maxSum=0;
		for (int i = 0; i < 4; i++) {
			minSum += numbers.get(i);
		}
		for (int i = 1; i < 5; i++) {
			maxSum += numbers.get(i);
		}
		System.out.println(minSum +" "+maxSum);

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		miniMaxSum(list);

	}

}
