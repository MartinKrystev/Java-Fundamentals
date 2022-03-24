package com.company.DataTypesAndVariables.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        long sum = (long) num1 + num2;
        long result = sum / num3 * num4;

        System.out.println(result);
    }
}
