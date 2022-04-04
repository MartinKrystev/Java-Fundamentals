package com.company.MidExam.E03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int shotTargetsCounter = 0;

        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);

            if (shotIndex >= 0 && shotIndex < targets.size() && targets.get(shotIndex) != -1) {
                int currTarget = targets.get(Integer.parseInt(String.valueOf(shotIndex)));
                shotTargetsCounter++;
                targets.set(shotIndex, -1);

                for (int i = 0; i < targets.size(); i++) {
                    int currValue = targets.get(i);

                    if (currValue != -1) {
                        if (currValue > currTarget) {
                            targets.set(i, currValue - currTarget);
                        } else {
                            targets.set(i, currValue + currTarget);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargetsCounter);
        System.out.print(targets.toString().trim().replaceAll("[\\[\\],]", ""));
    }
}
