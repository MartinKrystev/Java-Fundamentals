package com.company.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isMagicNum = false;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int currentNum = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            isMagicNum = (sum == 5) || (sum == 7) || (sum == 11);

            if (isMagicNum) {
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }

            i = currentNum;
        }
    }
}
