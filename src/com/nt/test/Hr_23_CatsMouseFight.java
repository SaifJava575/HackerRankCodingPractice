package com.nt.test;

public class Hr_23_CatsMouseFight {

	static String catAndMouse(int x, int y, int z) {
		int distanceFromCatA = Math.abs(x - z);
		int distanceFromCatB = Math.abs(y - z);

		if (distanceFromCatA < distanceFromCatB) {
			return "Cat A";
		} else if (distanceFromCatB < distanceFromCatA) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
	}

	public static void main(String[] args) {
		
		String response=catAndMouse(2, 5, 4);
		System.out.println("The expected output is "+response);

	}

}
