package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            char currentLetter = scanner.nextLine().charAt(0);
            sum += currentLetter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
