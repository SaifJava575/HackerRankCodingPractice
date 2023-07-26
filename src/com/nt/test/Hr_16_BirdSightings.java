package com.nt.test;

import java.util.*;

public class Hr_16_BirdSightings {

	public static int mostFrequentBird(List<Integer> arr) {
		Map<Integer, Integer> birdCount = new TreeMap<>();
		for (int i = 0; i < arr.size(); i++) {
			int countEle = 0;
			for (int j = 0; j < arr.size(); j++) {
				if (i + 1 == arr.get(j))
					countEle++;
			}
			birdCount.put(i + 1, countEle);
		}
		int maxCount = 0;
		int mostFrequentBirdId = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : birdCount.entrySet()) {
			int birdId = entry.getKey();
			int count = entry.getValue();

			if (count > maxCount || (count == maxCount && birdId < mostFrequentBirdId)) {
				maxCount = count;
				mostFrequentBirdId = birdId;
			}
		}

		return mostFrequentBirdId;
	}

	public static int mostFrequentBird1(List<Integer> sightings) {

		Map<Integer, Integer> birdCount = new HashMap<>();
		for (int birdId : sightings) {
			birdCount.put(birdId, birdCount.getOrDefault(birdId, 0) + 1);
		}
		int maxCount = 0;
		int mostFrequentBirdId = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : birdCount.entrySet()) {
			int birdId = entry.getKey();
			int count = entry.getValue();

			if (count > maxCount || (count == maxCount && birdId < mostFrequentBirdId)) {
				maxCount = count;
				mostFrequentBirdId = birdId;
			}
		}

		return mostFrequentBirdId;
	}

	public static int mostFrequentBird2(List<Integer> arr) {
		Map<Integer, Integer> birdCount = new TreeMap<>();
		
		for (int i = 0; i < arr.size(); i++) {
			if(birdCount.containsKey(arr.get(i)))
				birdCount.put(arr.get(i), birdCount.get(arr.get(i))+1);
			else 
				birdCount.put(arr.get(i),1);

			
		}
		int maxCount = 0;
		int mostFrequentBirdId = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : birdCount.entrySet()) {
			int birdId = entry.getKey();
			int count = entry.getValue();

			if (count > maxCount || (count == maxCount && birdId < mostFrequentBirdId)) {
				maxCount = count;
				mostFrequentBirdId = birdId;
			}
		}

		return mostFrequentBirdId;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(3);
		int response = mostFrequentBird2(list);
		System.out.println("The lowest Migration bird is " + response);
	}
}
