package com.company.Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        //coffee, water, coke, snacks
        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00
        switch (type){
            case "coffee":
                printCoffeePrice(quantity);
                break;
            case "water":
                printWaterPrice(quantity);
                break;
            case "coke":
                printCokePrice(quantity);
                break;
            case "snacks":
                printSnacksPrice(quantity);
                break;
        }

    }

    public static void printCoffeePrice(int quantity) {
        double totalPrice = quantity * 1.50;
        System.out.printf("%.2f", totalPrice);
    }

    public static void printWaterPrice(int quantity) {
        double totalPrice = quantity * 1.00;
        System.out.printf("%.2f", totalPrice);
    }

    public static void printCokePrice(int quantity) {
        double totalPrice = quantity * 1.40;
        System.out.printf("%.2f", totalPrice);
    }

    public static void printSnacksPrice(int quantity) {
        double totalPrice = quantity * 2.00;
        System.out.printf("%.2f", totalPrice);
    }
}
