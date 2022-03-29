package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> forceBookMap = new LinkedHashMap<>();
        List<String> usersList = new ArrayList<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String[] data = input.split(" \\| ");
                String side = data[0];
                String user = data[1];

                forceBookMap.putIfAbsent(side, new ArrayList<>());
                boolean noneMatch = forceBookMap.entrySet().stream().noneMatch(entry -> entry.getValue().contains(user));

                if (noneMatch) {
                    forceBookMap.get(side).add(user);
                }
            } else {
                String[] data = input.split(" -> ");
                String user = data[0];
                String side = data[1];

                forceBookMap.forEach((k, v) -> v.remove(user));
                forceBookMap.putIfAbsent(side, new ArrayList<>());
                forceBookMap.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }
        forceBookMap.forEach((k, v) -> {
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });

    }
}
