package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class hr_10_CountApplesAndOranges {

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int appleCount = 0;
		int orangeCount = 0;

		for (Integer appleDistance : apples) {
			int landingPosition = a + appleDistance;
			if (landingPosition >= s && landingPosition <= t) {
				appleCount++;
			}
		}

		for (Integer orangeDistance : oranges) {
			int landingPosition = b + orangeDistance;
			if (landingPosition >= s && landingPosition <= t) {
				orangeCount++;
			}
		}

		System.out.println("Apples: " + appleCount);
		System.out.println("Oranges: " + orangeCount);
	}

	public static void main(String[] args) {
		List<Integer> apples = new ArrayList<Integer>();
		apples.add(2);
		apples.add(3);
		apples.add(-4);

		List<Integer> oranges = new ArrayList<Integer>();
		oranges.add(3);
		oranges.add(-2);
		oranges.add(-4);

		countApplesAndOranges(7, 10, 4, 12, apples, oranges);
	}
}
