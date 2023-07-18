package com.nt.code;
public class StringTransformation {
    public static void main(String[] args) {
        String str = "world hel2o";
        String transformedStr = transformString(str);
        System.out.println(transformedStr);
    }

    public static String transformString(String str) {
        StringBuilder result = new StringBuilder();

        // Split the string into words based on spaces
        String[] words = str.split("\\s+");

        for (String word : words) {
            // Capitalize the first letter of each word
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            result.append(capitalizedWord).append(" ");
        }

        // Remove the trailing space and return the transformed string
        return result.toString().trim();
    }
}
