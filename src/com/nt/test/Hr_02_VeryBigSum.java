package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_02_VeryBigSum {

	public static long aVeryBigSum(List<Long> ar) {
		long total = 0;
		for (Long ele : ar)
			total += ele;
		return total;
	}

	public static void main(String[] args) {
		List<Long> list = new ArrayList<>();
		list.add(1000000001l);
		list.add(1000000002l);
		list.add(1000000003l);
		list.add(1000000004l);
		list.add(1000000005l);
		long response=aVeryBigSum(list);
		System.out.println("The very Big sum is "+response);
	}
}
