package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hr_07_BirthDayCakeCandles {

	public static int birthdayCakeCandles(List<Integer> candles) {
		
		Collections.sort(candles);
		int n=candles.size();
		int tallestCandleHeight = candles.get(n-1);
		int tallestCandleCount = 1;
		for (int i = 0; i < candles.size()-1; i++)
			if (candles.get(i) == tallestCandleHeight)
				tallestCandleCount++;
			else
				continue;
		return tallestCandleCount;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(3);

		int response = birthdayCakeCandles(list);
		System.out.println("The number tallest candles hieght " + response);

	}

}
