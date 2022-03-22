package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersNum = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        for (int i = 0; i < ordersNum; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int daysCount = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double curentPrice = (daysCount * capsulesCount) * capsulePrice;
            totalPrice += curentPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", curentPrice);
        }
        System.out.printf("Total: $%.2f",totalPrice);

    }
}
