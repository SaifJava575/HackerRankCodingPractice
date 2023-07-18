package com.nt.test;
import java.util.*;

public class BetweenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the arrays
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Read the elements of the arrays
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1.add(scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            arr2.add(scanner.nextInt());
        }

        // Find the maximum value in arr1 and the minimum value in arr2
        int maxArr1 = Collections.max(arr1);
        int minArr2 = Collections.min(arr2);

        int count = 0;

        // Check all numbers between maxArr1 and minArr2 (inclusive)
        for (int num = maxArr1; num <= minArr2; num++) {
            boolean satisfiesCondition = true;

            // Check condition 1: Elements of the first array are factors of the number
            for (int factor : arr1) {
                if (num % factor != 0) {
                    satisfiesCondition = false;
                    break;
                }
            }

            // Check condition 2: Number is a factor of all elements of the second array
            if (satisfiesCondition) {
                for (int element : arr2) {
                    if (element % num != 0) {
                        satisfiesCondition = false;
                        break;
                    }
                }
            }

            if (satisfiesCondition) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
