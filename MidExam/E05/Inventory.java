package com.company.MidExam.E05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            List<String> command = Arrays.stream(input.split(" - ")).collect(Collectors.toList());

            switch (command.get(0)) {
                case "Collect":
                    if (!journal.contains(command.get(1))) {
                        journal.add(command.get(1));
                    }
                    break;
                case "Drop":
                    if (journal.contains(command.get(1))) {
                        journal.removeIf(n -> n.equals(command.get(1)));
                    }
                    break;
                case "Combine Items":
                    List<String> oldNewItem = Arrays.stream(command.get(1).split(":")).collect(Collectors.toList());
                    if (journal.contains(oldNewItem.get(0))) {
                        String oldItem = oldNewItem.get(0);
                        int itemIndex = journal.indexOf(oldItem);
                        journal.add(itemIndex + 1, oldNewItem.get(1));
                    }
                    break;
                case "Renew":
                    if (journal.contains(command.get(1))) {
                        String toRenew = command.get(1);
                        journal.removeIf(n -> n.equals(toRenew));
                        journal.add(toRenew);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < journal.size(); i++) {
            System.out.print(journal.get(i).replaceAll("[\\[\\],]", ""));
            if (i < journal.size() - 1){
                System.out.print(", ");
            }
        }

    }
}
