package com.nt.code;

public class CountStringIntegerDouble {
	public static void main(String[] args) {
		String input = "you are 2 boys 1 are good 2.4";
		typeCounter(input);
	}


	public static  void typeCounter(String input) {
		int wordCount = 0;
		int integerCount = 0;
        int doubleCount=0;
		
		input = input.trim();

		// Split the input string by whitespace
		String[] words = input.split("\\s+");

		for (String word : words) {
			// Check if the word is an integer
			if (isInteger(word)) {
				integerCount++;
			} else if(isDouble(word)) {
				doubleCount++;
			} else 
				wordCount++;
		}

		// Output the results
		System.out.println("Number of words: " + wordCount);
		System.out.println("Number of integers: " + integerCount);
		System.out.println("Number of Doublr: " + doubleCount);

	}

	// Helper method to check if a string is an integer
	private static boolean isInteger(String str) {
	        try {
	            Integer.parseInt(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	private static boolean isDouble(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

}
