package com.company.Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);
    }

    public static void topNumber(int n) {
        for (int i = 1; i <= n; i++) {

            // Creating and filling the int[] from n
            String temp = Integer.toString(i);
            int[] currentArr = new int[temp.length()];
            for (int j = 0; j < temp.length(); j++) {
                currentArr[j] = temp.charAt(j) - '0';
            }

            int digitSum = 0;
            for (int k = 0; k < currentArr.length; k++) {
                digitSum += currentArr[k];
            }

            for (int l = 0; l < currentArr.length; l++) {
                if (currentArr[l] % 2 != 0 && digitSum % 8 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
