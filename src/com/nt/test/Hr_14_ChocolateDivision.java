package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_14_ChocolateDivision {

	static int birthdayChocolate(int[] chocolate, int day, int month) {
		int ways = 0;
		int n = chocolate.length;
		if (n < month)
			return ways; // If the number of squares is less than Ron's birth month, there are no ways to
							// // divide the chocolate
		int sum = 0;
		for (int i = 0; i < month; i++)
			sum += chocolate[i];
		if (sum == day)
			ways++;
		for (int i = month; i < n; i++) {
			sum += chocolate[i] - chocolate[i - month];
			if (sum == day)
				ways++;
		}
		return ways;
	}

	static int birthdayChocolate1(List<Integer> chocolate, int day, int month) {
		int ways = 0;
		int n = chocolate.size();
		if (n < month)
			return ways; // If the number of squares is less than Ron's birth month, there are no ways to
							// // divide the chocolate
		int sum = 0;
		for (int i = 0; i < month; i++)
			sum += chocolate.get(i);
		if (sum == day)
			ways++;
		for (int i = month; i < n; i++) {
			sum += chocolate.get(i) - chocolate.get(i - month);
			if (sum == day)
				ways++;
		}
		return ways;
	}

	public static void main(String[] args) {
		int[] chocolate = { 1, 2, 1, 3, 2 };
		int day = 3; // Ron's birth day
		int month = 2; // Ron's birth month

		int ways = birthdayChocolate(chocolate, day, month);
		System.out.println("Number of ways to divide the chocolate: " + ways);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		
		int ways1 = birthdayChocolate1(list, day, month);
		System.out.println("Number of ways to divide the chocolate: " + ways1);
		

	}
}
