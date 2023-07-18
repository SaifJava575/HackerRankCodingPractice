package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hr_12_TwoSets {

	public static int getTotalX(List<Integer> arr1, List<Integer> arr2) {

		int maxArr1 = Collections.max(arr1);
		int minArr2 = Collections.min(arr2);

		int count = 0;

		// Check all numbers between maxArr1 and minArr2 (inclusive)
		for (int num = maxArr1; num <= minArr2; num++) {
			boolean satisfiesCondition = true;

			// Check condition 1: Elements of the first array are factors of the number
			for (int factor : arr1) {
				if (num % factor != 0) {
					satisfiesCondition = false;
					break;
				}
			}

			// Check condition 2: Number is a factor of all elements of the second array
			if (satisfiesCondition) {
				for (int element : arr2) {
					if (element % num != 0) {
						satisfiesCondition = false;
						break;
					}
				}
			}

			if (satisfiesCondition)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
    
		List<Integer> apples = new ArrayList<Integer>();
		apples.add(2);
		apples.add(6);
		
		List<Integer> oranges = new ArrayList<Integer>();
		oranges.add(24);
		oranges.add(36);
		
		int response=getTotalX(apples, oranges);
		System.out.println("The maxmium Total Value is "+response);
		
	}

}
