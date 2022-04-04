package com.company.MidExam.E06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        List<Integer> toRepair = new ArrayList<>();
        boolean won = false;
        boolean lost = false;

        while (!input.equals("Retire")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Fire": //Fire {index} {damage}
                    int fireIndex = Integer.parseInt(command[1]);
                    int fireDamage = Integer.parseInt(command[2]);
                    if (fireIndex >= 0 && fireIndex < warShip.size()) {
                        warShip.set(fireIndex, (warShip.get(fireIndex) - fireDamage));
                        if (warShip.get(fireIndex) <= 0) {
                            won = true;
                            break;
                        }
                    }
                    break;
                case "Defend": //Defend {startIndex} {endIndex} {damage}
                    int defendStartIndex = Integer.parseInt(command[1]);
                    int defendEndIndex = Integer.parseInt(command[2]);
                    int defendDamage = Integer.parseInt(command[3]);
                    if ((defendStartIndex >= 0 && defendStartIndex < pirateShip.size())
                            && (defendEndIndex >= 0 && defendEndIndex < pirateShip.size())) {
                        for (int i = defendStartIndex; i <= defendEndIndex; i++) {
                            pirateShip.set(i, pirateShip.get(i) - defendDamage);
                            if (pirateShip.get(i) <= 0) {
                                lost = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair": //Repair {index} {health}
                    int repairIndex = Integer.parseInt(command[1]);
                    int repairHealth = Integer.parseInt(command[2]);
                    if (repairIndex >= 0 && repairIndex < pirateShip.size()) {
                        pirateShip.set(repairIndex, pirateShip.get(repairIndex) + repairHealth);
                        if (pirateShip.get(repairIndex) > maxHealth) {
                            pirateShip.set(repairIndex, maxHealth);
                        }
                    }
                    break;
                case "Status":
                    int counter = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < maxHealth * 0.2) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
                    break;
            }
            input = scanner.nextLine();
        }
        if (won) {
            System.out.println("You won! The enemy ship has sunken.");
        } else if (lost) {
            System.out.println("You lost! The pirate ship has sunken.");
        } else {
            int pirateShipSum = 0;
            int warShipSum = 0;
            for (int i = 0; i < pirateShip.size(); i++) {
                pirateShipSum += pirateShip.get(i);
            }
            for (int i = 0; i < warShip.size(); i++) {
                warShipSum += warShip.get(i);
            }
            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            System.out.printf("Warship status: %d", warShipSum);
        }
    }
}
