package com.company.MidExam.EXAM;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * waterPerDay;
        double totalFood = days * players * foodPerDay;

        boolean outOfEnergy = false;

        for (int i = 1; i <= days; i++) {
            double currEnergyLoss = Double.parseDouble(scanner.nextLine());

            energy -= currEnergyLoss;

            if (energy <= 0) {
                outOfEnergy = true;
                break;
            }

            if (i % 2 == 0) {
                energy = energy * 1.05;
                totalWater = totalWater * 0.7;
            }

            if (i % 3 == 0) {
                totalFood -= totalFood / players;
                energy = energy * 1.10;
            }

        }

        if (outOfEnergy) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }



    }
}
