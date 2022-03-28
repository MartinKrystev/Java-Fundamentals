<<<<<<< HEAD
package com.company.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] action = command.split(" ");

            switch (action[0]) {
                case "merge":
                    int start = Integer.parseInt(action[1]);
                    int end = Integer.parseInt(action[2]);

                    if (start < 0) {
                        start = 0;
                    }

                    if (end > input.size() - 1) {
                        end = input.size() - 1;
                    }
                    //Merging the diff parts, starting with the initial Index
                    int initialIndex = start;
                    for (int i = start; i < end; i++) {
                        String merged = input.get(initialIndex) + input.get(initialIndex + 1);

                        input.set(initialIndex, merged);
                        input.remove(initialIndex + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(action[1]);
                    int partitions = Integer.parseInt(action[2]);

                    if (index >= 0 && index < input.size() && partitions >= 0 && partitions <= 100) {
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    merged += symbol;
                                    count++;
                                }
                                newList.add(merged);
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                }
                                newList.add(merged);
                            }
                        }
                        input.remove(index);
                        input.addAll(index, newList);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String el : input) {
            System.out.print(el + " ");
        }
    }
=======
package com.company.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] action = command.split(" ");

            switch (action[0]) {
                case "merge":
                    int start = Integer.parseInt(action[1]);
                    int end = Integer.parseInt(action[2]);

                    if (start < 0) {
                        start = 0;
                    }

                    if (end > input.size() - 1) {
                        end = input.size() - 1;
                    }
                    //Merging the diff parts, starting with the initial Index
                    int initialIndex = start;
                    for (int i = start; i < end; i++) {
                        String merged = input.get(initialIndex) + input.get(initialIndex + 1);

                        input.set(initialIndex, merged);
                        input.remove(initialIndex + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(action[1]);
                    int partitions = Integer.parseInt(action[2]);

                    if (index >= 0 && index < input.size() && partitions >= 0 && partitions <= 100) {
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    merged += symbol;
                                    count++;
                                }
                                newList.add(merged);
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                }
                                newList.add(merged);
                            }
                        }
                        input.remove(index);
                        input.addAll(index, newList);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String el : input) {
            System.out.print(el + " ");
        }
    }
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
}