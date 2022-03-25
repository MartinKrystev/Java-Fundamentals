package com.company.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //    {1} {2} {3} {3}
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}