package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;
        switch (peopleType) {
            case "Students":
                if (day.equals("Friday") && peopleCount >= 30) {
                    totalPrice = (peopleCount * 8.45) * 0.85;
                } else if (day.equals("Friday") && peopleCount < 30) {
                    totalPrice = peopleCount * 8.45;
                }
                if (day.equals("Saturday") && peopleCount >= 30) {
                    totalPrice = (peopleCount * 9.80) * 0.85;
                } else if (day.equals("Saturday") && peopleCount < 30) {
                    totalPrice = peopleCount * 9.80;
                }
                if (day.equals("Sunday") && peopleCount >= 30) {
                    totalPrice = (peopleCount * 10.46) * 0.85;
                } else if (day.equals("Sunday") && peopleCount < 30) {
                    totalPrice = peopleCount * 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday") && peopleCount >= 100) {
                    totalPrice = (peopleCount - 10) * 10.90;
                } else if (day.equals("Friday") && peopleCount < 100) {
                    totalPrice = peopleCount * 10.90;
                }
                if (day.equals("Saturday") && peopleCount >= 100) {
                    totalPrice = (peopleCount - 10) * 15.60;
                } else if (day.equals("Saturday") && peopleCount < 100) {
                    totalPrice = peopleCount * 15.60;
                }
                if (day.equals("Sunday") && peopleCount >= 100) {
                    totalPrice = (peopleCount - 10) * 16;
                } else if (day.equals("Sunday") && peopleCount < 100) {
                    totalPrice = peopleCount * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday") && peopleCount >= 10 && peopleCount <= 20) {
                    totalPrice = (peopleCount * 15) * 0.95;
                } else if (day.equals("Friday") && (peopleCount < 10 || peopleCount > 20)) {
                    totalPrice = peopleCount * 15;
                }
                if (day.equals("Saturday") && peopleCount >= 10 && peopleCount <= 20) {
                    totalPrice = (peopleCount * 20) * 0.95;
                } else if (day.equals("Saturday") && (peopleCount < 10 || peopleCount > 20)) {
                    totalPrice = peopleCount * 20;
                }
                if (day.equals("Sunday") && peopleCount >= 10 && peopleCount <= 20) {
                    totalPrice = (peopleCount * 22.50) * 0.95;
                } else if (day.equals("Sunday") && (peopleCount < 10 || peopleCount > 20)) {
                    totalPrice = peopleCount * 22.50;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}