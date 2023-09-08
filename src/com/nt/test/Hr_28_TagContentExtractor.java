package com.nt.test;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hr_28_TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();
            extractValidContents(line);
            testCases--;
        }
    }

    public static void extractValidContents(String line) {
        // Define a regular expression pattern to match valid tags
        String regex = "<(\\w+)[^>]*>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        Stack<String> stack = new Stack<>();
        boolean found = false;

        while (matcher.find()) {
            String tag = matcher.group(1);
            if (!stack.isEmpty() && stack.peek().equals(tag)) {
                // Nested tag, do not consider content
                stack.pop();
            } else {
                stack.push(tag);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        } else {
            StringBuilder result = new StringBuilder();
            int start = 0;

            for (String tag : stack) {
                Pattern tagPattern = Pattern.compile("<" + tag + ".*?</" + tag + ">");
                Matcher tagMatcher = tagPattern.matcher(line);

                if (tagMatcher.find(start)) {
                    result.append(tagMatcher.group(0)).append("\n");
                    start = tagMatcher.end();
                }
            }

            System.out.print(result.toString());
        }
    }
}
