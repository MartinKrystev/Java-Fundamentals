package com.company.BasicSyntax.CS.Loops.Lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketCost = 0;

        if (dayType.equals("Weekday")) {
            if (0 <= age && age <= 18) {
                ticketCost = 12;
            } else if (18 < age && age <= 64) {
                ticketCost = 18;
            } else if (64 < age && age <= 122) {
                ticketCost = 12;
            }
        } else if (dayType.equals("Weekend")) {
            if (0 <= age && age <= 18) {
                ticketCost = 15;
            } else if (18 < age && age <= 64) {
                ticketCost = 20;
            } else if (64 < age && age <= 122) {
                ticketCost = 15;
            }
        } else if (dayType.equals("Holiday")) {
            if (0 <= age && age <= 18) {
                ticketCost = 5;
            } else if (18 < age && age <= 64) {
                ticketCost = 12;
            } else if (64 < age && age <= 122) {
                ticketCost = 10;
            }
        }
        if (ticketCost != 0) {
            System.out.println(ticketCost + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
