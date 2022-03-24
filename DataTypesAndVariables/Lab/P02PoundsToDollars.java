package com.company.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 British Pound = 1.36 Dollars
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
