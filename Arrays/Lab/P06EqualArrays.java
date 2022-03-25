package com.company.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        boolean notIdentical = false;
        int maxLength = Math.max(firstArr.length, secondArr.length);
        int sum = 0;
        for (int i = 0; i < maxLength; i++) {
            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                notIdentical = true;
                break;
            }
        }
        if (!notIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
