package com.company.Methods.MoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int numberInt = Integer.parseInt(scanner.nextLine());
                printInt(numberInt);
                break;
            case "real":
                double numberDouble = Double.parseDouble(scanner.nextLine());
                printDouble(numberDouble);
                break;
            case "string":
                String text = scanner.nextLine();
                printString(text);
                break;
        }

    }

    public static void printInt(int number) {

        System.out.println(number * 2);
    }

    public static void printDouble(double number) {
        double result = number * 1.5;
        System.out.printf("%.2f", result);
    }

    public static void printString(String text) {

        System.out.println("$" + text + "$");
    }

}
