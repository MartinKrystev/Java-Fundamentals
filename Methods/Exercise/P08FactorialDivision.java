package com.company.Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorialsDivision(n1, n2));
    }

    public static double factorialsDivision(int a, int b) {
        long fact1 = 1;
        for (int i = 1; i <= a; i++) {
            fact1 = fact1 * i;
        }

        long fact2 = 1;
        for (int j = 1; j <= b; j++) {
            fact2 = fact2 * j;
        }

        return fact1 * 1.0 / fact2;
    }
}
