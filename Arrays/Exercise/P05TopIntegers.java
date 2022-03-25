package com.company.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        StringBuilder result = new StringBuilder();         //String for the print
        for (int i = 0; i < arr.length; i++) {
            boolean isBigger = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {                      //Check if it is bigger
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                result.append(arr[i]).append(" ");
            }
        }
        System.out.println(String.join(" ", result));
    }
}