package com.company.MidExam.E01;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double priceSum = 0.0;
        double currentPrice = 0.0;
        double priceWithTax = 0.0;
        double tax = 0.0;

        while (!input.equals("special") && !input.equals("regular")) {
            currentPrice = Double.parseDouble(input);
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceSum += currentPrice;
            }
            input = scanner.nextLine();
        }
        if (input.equals("special")) {
            priceWithTax = ((priceSum * 1.2) * 0.9);
            tax = priceSum * 0.2;

        } else if (input.equals("regular")) {
            priceWithTax = priceSum * 1.2;
            tax = priceSum * 0.2;
        }
        if (priceWithTax == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceSum);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", priceWithTax);
        }
    }
}
