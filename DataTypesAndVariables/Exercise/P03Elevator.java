package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double coursesNeeded = people % (double) capacity;

        if (coursesNeeded != 0) {
            double result = people / (double) capacity + 1;
            System.out.printf("%.0f", Math.floor(result));
        } else {
            double result = people / (double) capacity;
            System.out.printf("%.0f", Math.floor(result));
        }

    }
}
