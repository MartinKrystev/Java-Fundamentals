package com.company.Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> lineList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (lineList.get(0)) {
                case "Contains":
                    if (numList.contains(Integer.valueOf(lineList.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    List<Integer> evenOrOddList = new ArrayList<>();
                    if (lineList.get(1).equals("even")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 == 0) {
                                evenOrOddList.add(numList.get(i));
                            }
                        }
                        System.out.println(evenOrOddList.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 != 0) {
                                evenOrOddList.add(numList.get(i));
                            }
                        }
                        System.out.println(evenOrOddList.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum += numList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    List<Integer> filteredList = new ArrayList<>();

                    switch (lineList.get(1)) {
                        case "<":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) < Integer.parseInt(lineList.get(2))) {
                                    filteredList.add(numList.get(i));
                                }
                            }
                            break;
                        case ">":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) > Integer.parseInt(lineList.get(2))) {
                                    filteredList.add(numList.get(i));
                                }
                            }
                            break;
                        case ">=":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) >= Integer.parseInt(lineList.get(2))) {
                                    filteredList.add(numList.get(i));
                                }
                            }
                            break;
                        case "<=":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) <= Integer.parseInt(lineList.get(2))) {
                                    filteredList.add(numList.get(i));
                                }
                            }
                            break;
                    }
                    System.out.println(filteredList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
