package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_01_CompareTriplets {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> com = new ArrayList<>();
		int alias=0;
		int bobs=0;
		for(int i=0;i<3;i++) {
			if(a.get(i)>b.get(i))
				alias++;
			else if(b.get(i)>a.get(i))
				bobs++;		
		}
		com.add(alias);
		com.add(bobs);
		return com;
	}

	public static void main(String[] args) {
		List<Integer> alias = new ArrayList<>();
		alias.add(5);
		alias.add(6);
		alias.add(7);

		List<Integer> bobs = new ArrayList<>();
		bobs.add(3);
		bobs.add(6);
		bobs.add(10);
		List<Integer>response=compareTriplets(alias, bobs);
		System.out.println("The response is "+response);
	}

}
