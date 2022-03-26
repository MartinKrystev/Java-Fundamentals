package com.company.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        //System.out.println(mathPower(num, power));
        System.out.println(new DecimalFormat("0.#####").format(mathPower(num, power)));
    }

    public static double mathPower(double num, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
