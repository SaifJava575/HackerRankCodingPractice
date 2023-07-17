package com.nt.test;


public class Hr_11_KangarooJump {
    public static String kangarooJump(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            if (x1 == x2) {
                return "YES"; // Kangaroos start at the same location and have the same speed
            } else {
                return "NO"; // Kangaroos have the same speed but start at different locations
            }
        }

        // Calculate the number of jumps needed for kangaroos to meet
        int jumps = (x2 - x1) / (v1 - v2);

        // Check if the kangaroos meet at the same location at the same time
        if (jumps >= 0 && (x1 + v1 * jumps) == (x2 + v2 * jumps)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 5;

        String result = kangarooJump(x1, v1, x2, v2);
        System.out.println(result); // Output: YES
    }
}
