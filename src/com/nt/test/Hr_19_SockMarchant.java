package com.nt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hr_19_SockMarchant {

	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.size(); i++) {
			if (map.containsKey(ar.get(i)))
				map.put(ar.get(i), map.get(ar.get(i))+1);
			else
				map.put(ar.get(i), 1);
		}
		int pair = 0;
		int count = 0;
		for (Map.Entry<Integer, Integer> val : map.entrySet()) {
			int data = val.getValue();		
				pair = data / 2;
				count += pair;
		}
		return count;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		int response = sockMerchant(list.size(), list);
		System.out.println("The sock pair are ::" + response);

	}

}
