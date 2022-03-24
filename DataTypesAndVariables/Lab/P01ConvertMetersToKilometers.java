package com.company.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        double km = distance / 1000.0;

        System.out.printf("%.2f", km);

    }
}
