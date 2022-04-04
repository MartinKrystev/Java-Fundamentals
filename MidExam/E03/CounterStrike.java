package com.company.MidExam.E03;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean outOfEnergy = false;
        int enemyCounter = 0;

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                enemyCounter++;
                energy -= distance;
            } else {
                outOfEnergy = true;
            }

            if (outOfEnergy) {
                break;
            }
            if (enemyCounter % 3 == 0) {
                energy += enemyCounter;
            }
            input = scanner.nextLine();
        }
        if (!outOfEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d", enemyCounter, energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", enemyCounter, energy);
        }

    }
}
