package com.company.FinalExam.E01;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieces = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("\\|");
            pieces.put(text[0], new ArrayList<>());
            pieces.get(text[0]).add(text[1]);
            pieces.get(text[0]).add(text[2]);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] command = input.split("\\|");
            switch (command[0]) {
                case "Add":
                    if (pieces.containsKey(command[1])) {
                        System.out.printf("%s is already in the collection!%n", command[1]);
                    } else {
                        pieces.put(command[1], new ArrayList<>());
                        pieces.get(command[1]).add(command[2]);
                        pieces.get(command[1]).add(command[3]);
                        System.out.printf("%s by %s in %s added to the collection!%n", command[1], command[2], command[3]);
                    }
                    break;
                case "Remove":
                    if (!pieces.containsKey(command[1])) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    } else {
                        pieces.remove(command[1]);
                        System.out.printf("Successfully removed %s!%n", command[1]);
                    }
                    break;
                case "ChangeKey":
                    if (!pieces.containsKey(command[1])) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    } else {
                        pieces.get(command[1]).set(1, command[2]);
                        System.out.printf("Changed the key of %s to %s!%n", command[1], command[2]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pieces.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
