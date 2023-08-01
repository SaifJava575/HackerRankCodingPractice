package com.nt.test;

public class Hr_20_DrawiingBook {

	public static int pageCount(int n, int p) {
		// Calculate the number of pages to turn from the front
	    int fromFront = p / 2;
	    
	    // Calculate the number of pages to turn from the back
	    int fromBack = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
	    
	    // Return the minimum number of pages to turn
	    return Math.min(fromFront, fromBack);

	}

	public static void main(String[] args) {
      int response=pageCount(6, 2);
      System.out.println("The min page turn to is :"+response);
	}

}
