package com.nt.test;

public class Hr_05_StairCaseProblem {

	public static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			// Print spaces for each row
			for (int j = 1; j <= n - i; j++) 
				System.out.print(" ");
			
			// Print asterisks for each row
			for (int k = 1; k <= i; k++) 
				System.out.print("*");
		
			// Move to the next line after printing each row
			System.out.println();
		}

	}

	public static void main(String[] args) {
		staircase(6);
	}

}
