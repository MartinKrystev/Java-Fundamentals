package com.company.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
