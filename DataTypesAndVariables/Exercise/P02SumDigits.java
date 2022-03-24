package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int lastDigit = 0;

        while (input > 0) {
            sum += input % 10;
            input = input / 10;
        }

        System.out.println(sum);

    }
}

