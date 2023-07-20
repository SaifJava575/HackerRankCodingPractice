package com.nt.java;

import java.util.Scanner;

public class Java_01_OddCheckFunction {

	public static String checkOddFunction(int n) {
		String res = "";
		if (n % 2 == 1)
			res = "Weird";
		else if (n % 2 == 0 && 2 < n && n < 5)
			res = "Not Weird";
		else if (n % 2 == 0 && 6 < n && n < 20)
			res = "Weird";
		else if (n % 2 == 0 && 20<=n)
			res = "Not Weird";
		return res;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int n=sc.nextInt();
		String str=checkOddFunction(n);
		System.out.println(str);
	}

}
