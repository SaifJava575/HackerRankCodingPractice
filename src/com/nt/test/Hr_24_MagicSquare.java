package com.nt.test;
import java.util.ArrayList;
import java.util.List;

public class Hr_24_MagicSquare {
    private static final int[][][] MAGIC_SQUARES = {
        {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
    };
	// private static boolean add;

    public static int formingMagicSquare(List<List<Integer>> s) {
        int minCost = Integer.MAX_VALUE;

        for (int[][] magicSquare : MAGIC_SQUARES) {
            int cost = calculateCost(s, magicSquare);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    private static int calculateCost(List<List<Integer>> s, int[][] magicSquare) {
        int cost = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(s.get(i).get(j) - magicSquare[i][j]);
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        List<List<Integer>> s1 = new ArrayList<>();
       
        int matrix[][]= {{4,9,2},{3,5,7},{8,1,5}};
        for(int[] row:matrix) {
            List<Integer> list=new ArrayList<>();
            for(int val:row)
            	list.add(val);
            s1.add(list);
        }
        

        System.out.println(formingMagicSquare(s1)); // Output: 1
    }
}
