package com.company.Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(mergedString(input, n));
    }

    public static String mergedString(String input, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += input;
        }
        return newString;
    }
}