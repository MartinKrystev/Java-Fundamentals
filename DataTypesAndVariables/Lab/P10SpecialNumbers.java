package com.company.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int numberSum = 0;

            while (currentNum > 0) {
                numberSum = numberSum + (currentNum % 10);
                currentNum = currentNum / 10;
            }


            if (numberSum == 5 || numberSum == 7 || numberSum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
