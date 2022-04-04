package com.company.MidExam.E06;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String action = command.get(0);

            switch (action) {
                case "Loot":
                    command.remove(0);
                    for (int i = 0; i < command.size(); i++) {
                        if (!chest.contains(command.get(i))) {
                            chest.add(0, command.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int removeIndex = Integer.parseInt(command.get(1));
                    if (removeIndex >= 0 && removeIndex < chest.size()) {
                        String forDrop = chest.get(removeIndex);
                        chest.remove(forDrop);
                        chest.add(forDrop);
                    }
                    break;
                case "Steal":
                    int countIndex = Integer.parseInt(command.get(1));
                    List<String> stolenItems = new ArrayList<>();

                    if (countIndex >= 0 && countIndex < chest.size()) {
                        for (int i = 0; i < countIndex; i++) {
                            String elToSteal = chest.get(Integer.parseInt(String.valueOf(chest.size() - 1)));
                            stolenItems.add(elToSteal);
                            chest.remove(elToSteal);
                        }
                        Collections.reverse(stolenItems);
                        stolenItems.toString().replaceAll("[\\[\\],]", "");
                        for (int i = 0; i < stolenItems.size(); i++) {
                            System.out.print(stolenItems.get(i));
                            if (i < stolenItems.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < chest.size(); i++) {
                            System.out.print(chest.get(i));
                            if (i < chest.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                        chest.clear();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int counter = 0;
        int sum = 0;
        double gain = 0.0;

        for (int i = 0; i < chest.size(); i++) {
            counter++;
            String[] currItem = chest.get(i).split("");
            for (int j = 0; j < currItem.length; j++) {
                sum++;
            }
        }
        gain = sum * 1.0 / counter;

        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", gain);
        }

    }
}
