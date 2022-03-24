package com.company.DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String num = scanner.nextLine();
            String[] parts = num.split(" "); // splits the string
            String leftSide = parts[0];           // takes the first part
            String rightSide = parts[1];          // takes the second part

            long leftNum = Long.parseLong(leftSide);
            long rightNum = Long.parseLong(rightSide);

            long biggerNum = rightNum;
            if (leftNum > biggerNum) {
                biggerNum = leftNum;
            }

            long sum = 0;
            while (biggerNum != 0) {
                sum += biggerNum % 10;
                biggerNum /= 10;
            }
            System.out.printf("%d%n", Math.abs(sum));
        }
    }
}
