package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_03_DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> matrix) {
		int n = matrix.size();
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		for (int i = 0; i < n; i++) {
			primaryDiagonalSum += matrix.get(i).get(i);
			secondaryDiagonalSum += matrix.get(i).get(n - 1 - i);
		}

		return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
	}

	public static int diagonalDifference(int[][] matrix) {
		int n = matrix.length;
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		for (int i = 0; i < n; i++) {
			primaryDiagonalSum += matrix[i][i];
			secondaryDiagonalSum += matrix[i][n - 1 - i];
		}
		return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		List<List<Integer>> matrixList = new ArrayList<>();

		for (int[] row : matrix) {
			List<Integer> rowList = new ArrayList<>();
			for (int element : row) {
				rowList.add(element);
			}
			matrixList.add(rowList);
		}
		System.out.println("the Input is " + matrixList);
		int response = diagonalDifference(matrixList);
		System.out.println("The Absolute Difference Two Diagonal Matrix is " + response);

		int difference1 = diagonalDifference(matrix);
		System.out.println("Absolute difference between the sums of diagonals: " + difference1);
	}
}
