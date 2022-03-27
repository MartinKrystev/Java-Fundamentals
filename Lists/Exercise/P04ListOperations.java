package com.company.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            List<String> input = Arrays.stream(line.split(" ")).collect(Collectors.toList());

            switch (input.get(0)) {
                case "Add":
                    numList.add(Integer.valueOf(input.get(1)));
                    break;
                case "Insert":
                    int number = Integer.parseInt(input.get(1));
                    int index = Integer.parseInt(input.get(2));
                    if (index > numList.size() - 1 || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numList.add(index, number);
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(input.get(1));
                    if (indexToRemove > numList.size() - 1 || indexToRemove < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numList.remove(indexToRemove);
                    }
                    break;
                case "Shift":
                    String direction = input.get(1);
                    int turns = Integer.parseInt(input.get(2));
                    int count = 0;

                    while (count < turns) {
                        if (direction.equals("left")) {
                            int numToChange = numList.get(0);
                            numList.add(numToChange);
                            numList.remove(0);
                            count++;
                        } else if (direction.equals("right")) {
                            int numToChange = numList.get(numList.size() - 1);
                            numList.remove(numList.size() - 1);
                            numList.add(0, numToChange);
                            count++;
                        }
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
