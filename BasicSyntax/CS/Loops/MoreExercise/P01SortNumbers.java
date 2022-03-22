package com.company.BasicSyntax.CS.Loops.MoreExercise;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());


        double biggest = num1;
        double mid = num2;
        double small = num3;

        if (num1 <= num2) {
            biggest = num2;
            mid = num1;
        } else {
            biggest = num1;
            mid = num2;
        }
        if (num3 >= num2 && num3 >= num1) {
            biggest = num3;
            if (num2 >= num1) {
                mid = num2;
                small = num1;
            } else {
                mid = num1;
                small = num2;
            }
        } else if (num1 <= num3 && num3 <= num2) {
            biggest = num2;
            mid = num3;
            small = num1;
        } else if (num2 <= num3 && num3 <= num1) {
            biggest = num1;
            mid = num3;
            small = num2;
        }
        System.out.printf("%.0f%n", biggest);
        System.out.printf("%.0f%n", mid);
        System.out.printf("%.0f%n", small);
//        System.out.println(biggest);
//        System.out.println(mid);
//        System.out.println(small);
    }
}
