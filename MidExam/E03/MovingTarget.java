package com.company.MidExam.E03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        //52 74 23 44 96 110     Shoot 5 10 -> Shoot 1 80 -> Strike 2 1 -> Add 22 3 ->  End
        while (!input.equals("End")) {
            List<String> line = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = line.get(0);

            switch (command) {
                case "Shoot":
                    int index = Integer.parseInt(line.get(1));
                    int power = Integer.parseInt(line.get(2));

                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);

                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int addIndex = Integer.parseInt(line.get(1));
                    int value = Integer.parseInt(line.get(2));

                    if (addIndex >= 0 && addIndex < line.size()) {
                        targets.add(addIndex, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int strikeIndex = Integer.parseInt(line.get(1));
                    int radius = Integer.parseInt(line.get(2));

                    if (strikeIndex - radius >= 0 && strikeIndex + radius < targets.size()) {
                        targets.subList(strikeIndex - radius, strikeIndex + (radius +1)).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        targets.toString().replaceAll("[\\[\\],]", "");
        for (int i = 0; i < targets.size(); i++) {
            System.out.print(targets.get(i));
            if (i != targets.size() - 1) {
                System.out.print("|");
            }
        }

    }
}
