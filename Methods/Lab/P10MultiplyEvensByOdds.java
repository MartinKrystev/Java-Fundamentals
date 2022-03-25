package com.company.Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(num));

    }

    public static int getMultipleOfEvensAndOdds(int num) {
        return getEvenSum(num) * getOddSum(num);
    }

    public static int getEvenSum(int num) {
        String intToString = Integer.toString(num);
        int[] numArray = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                evenSum += numArray[i];
            }
        }
        return evenSum;
    }

    public static int getOddSum(int num) {
        String intToString = Integer.toString(num);
        int[] numArray = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0) {
                oddSum += numArray[i];
            }
        }
        return oddSum;
    }
}