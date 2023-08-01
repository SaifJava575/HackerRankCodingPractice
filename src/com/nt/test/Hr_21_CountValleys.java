package com.nt.test;

public class Hr_21_CountValleys {
	
	public static int countingValleys(int steps, String path) {
	    int level = 0; // Represents the current altitude
	    int valleys = 0; // Number of valleys traversed

	    // Loop through each step in the path
	    for (char step : path.toCharArray()) {
	        if (step == 'U') 
	            level++; // Step up
	         else if (step == 'D') {
	            level--; // Step down
	            if (level == -1) 
	                // If the level goes below sea level, it means we entered a valley
	                valleys++;	            
	        }
	    }

	    return valleys;
	}


	public static void main(String[] args) {
		String path="UDDDUDUU";
		int steps=path.length();
     int response=countingValleys(steps,path);
     System.out.println("The position of the hiker is::"+response);
	}

}
