package com.company.MidExam.EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" - ");

            switch (command[0]) {
                case "Add":
                    caseAdd(list, command);
                    break;
                case "Remove":
                    list.removeIf(n -> n.equals(command[1]));
                    break;
                case "Bonus phone":
                    caseBonusPhone(list, command);
                    break;
                case "Last":
                    caseLast(list, command);
                    break;
            }
            input = scanner.nextLine();
        }
        printThemAll(list);
    }

    public static void printThemAll(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void caseAdd(List<String> list, String[] command) {
        if (!list.contains(command[1])) {
            list.add(command[1]);
        }
    }

    public static void caseBonusPhone(List<String> list, String[] command) {
        String[] bonusPhone = command[1].split(":");
        String oldPhone = bonusPhone[0];
        String newPhone = bonusPhone[1];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldPhone)) {
                list.add(i + 1, newPhone);
                break;
            }
        }
    }

    public static void caseLast(List<String> list, String[] command) {
        String lastPhone = command[1];
        if (list.contains(lastPhone)) {
            list.remove(lastPhone);
            list.add(lastPhone);
        }
    }
}

