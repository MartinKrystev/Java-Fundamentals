package com.company.Arrays.Exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            int[] inputNumArr = new int[inputArr.length];
            for (int j = 0; j < inputNumArr.length; j++) {
                inputNumArr[j] = Integer.parseInt(inputArr[j]);
            }
            if (i % 2 == 0) {
                firstArr[i] = inputNumArr[0];
                secondArr[i] = inputNumArr[1];
            } else {
                firstArr[i] = inputNumArr[1];
                secondArr[i] = inputNumArr[0];
            }
        }

        for (int k = 0; k < firstArr.length; k++) {
            System.out.print(firstArr[k]);
            if (k != firstArr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int l = 0; l < secondArr.length; l++) {
            System.out.print(secondArr[l]);
            if (l != secondArr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}