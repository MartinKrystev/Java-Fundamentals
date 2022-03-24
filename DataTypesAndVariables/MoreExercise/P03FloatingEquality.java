package com.company.DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double biggerNum = num1;
        double smallerNum = num2;
        if (num2 > num1) {
            biggerNum = num2;
            smallerNum = num1;
        }

        if (biggerNum - smallerNum <= 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
