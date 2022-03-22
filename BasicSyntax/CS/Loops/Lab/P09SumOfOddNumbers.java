package com.company.BasicSyntax.CS.Loops.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
            if (count == input) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
