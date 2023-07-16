package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_09_GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> list = new ArrayList<>();
		for(Integer ele:grades) {
			if(ele<38)
				list.add(ele);
			else if(ele>=38) {
				int data=ele/5+1;
				int multiple0f5=5*data;
				int result=multiple0f5-ele;
				if(result>=3)
					list.add(ele);
				else
					list.add(multiple0f5);				
			} 
				
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);

		List<Integer> response = gradingStudents(list);
		System.out.println("Final Grade is " + response);

	}

}
