package com.company.Methods.Lab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = Double.parseDouble(scanner.nextLine());

        grade(score);
    }

    public static void grade(double score) {
        if (score >= 2 && score <= 2.99) {
            System.out.println("Fail");
        } else if (score >= 3.00 && score <= 3.49) {
            System.out.println("Poor");
        } else if (score >= 3.50 && score <= 4.49) {
            System.out.println("Good");
        } else if (score >= 4.50 && score <= 5.49) {
            System.out.println("Very good");
        } else if (score >= 5.50 && score <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
