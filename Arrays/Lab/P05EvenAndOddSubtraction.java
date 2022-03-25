package com.company.Arrays.Lab;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" "); //разделя масива на елементи

        int[] numArr = new int[inputArr.length]; // създава нов Int масив

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numArr.length; i++) { // задава стойности на Int масива
            numArr[i] = Integer.parseInt(inputArr[i]);
        }

        for (int num : numArr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
