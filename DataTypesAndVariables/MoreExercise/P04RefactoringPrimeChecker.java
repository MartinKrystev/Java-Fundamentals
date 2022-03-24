package com.company.DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int n = 2; n <= input; n++) {
            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", n, isPrime);
        }

    }
}
