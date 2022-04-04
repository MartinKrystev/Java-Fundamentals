package com.company.MidExam.E05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        //rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest
        //cat 10|potion 30|orc 10|chest 10|snake 25|chest 110
        int health = 100;
        int bitcoins = 0;
        boolean isDead = false;
        int bestRoom = 1;
        for (int i = 0; i < rooms.size(); i++) {
            List<String> currRoom = Arrays.stream(rooms.get(i).split(" ")).collect(Collectors.toList());


            if (currRoom.get(0).equals("potion")) {
                int healedPoints = Integer.parseInt(currRoom.get(1));
                int currHealth = health;
                health += healedPoints;
                if (health > 100) {
                    healedPoints = 100 - currHealth;
                    health = 100;
                }
                System.out.printf("You healed for %d hp.%n", healedPoints);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (currRoom.get(0).equals("chest")) {
                int foundBitcoins = Integer.parseInt(currRoom.get(1));
                System.out.printf("You found %d bitcoins.%n", foundBitcoins);
                bitcoins += foundBitcoins;

            } else {
                String monster = currRoom.get(0);
                int attack = Integer.parseInt(currRoom.get(1));

                health -= attack;

                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d%n", bestRoom);
                    isDead = true;
                } else {
                    System.out.printf("You slayed %s.%n", monster);
                }
            }
            if (isDead) {
                break;
            } else {
                bestRoom++;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }

    }
}
