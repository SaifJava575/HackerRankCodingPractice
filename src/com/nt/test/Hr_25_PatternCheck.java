package com.nt.test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Hr_25_PatternCheck {

	public static boolean isValidRegexPattern(String pattern) {
		try {
			// Attempt to compile the pattern, and if successful, return true
			Pattern.compile(pattern);
			return true;
		} catch (PatternSyntaxException e) {
			// If an exception is thrown, the pattern is invalid, so return false
			return false;
		}
	}

	public static void main(String[] args) {
		// Test Case
		// 1.([A-Z])(.+)
		// 2.[AZ[a-z](a-z)
		// 3.batcatpat(nat
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			if (isValidRegexPattern(pattern)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}

}
