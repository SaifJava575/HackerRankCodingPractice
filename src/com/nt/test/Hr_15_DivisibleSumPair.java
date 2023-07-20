package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_15_DivisibleSumPair {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j <n; j++)
				if ((ar.get(i) +ar.get(j)) % k == 0)
					count++;
		return count;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int n = list.size();
		int k = 5;
		int response = divisibleSumPairs(n, k, list);
		System.out.println("Divisible Sum Pair is " + response);
	}

}
