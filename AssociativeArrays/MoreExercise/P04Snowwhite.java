package com.company.AssociativeArrays.MoreExercise;

import java.util.*;

public class P04Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> pool = new LinkedHashMap<>();

        while (!input.equals("Once upon a time")) {
            String[] data = input.split(" <:> ");
            String name = data[0];
            String hatColor = data[1];
            int physics = Integer.parseInt(data[2]);

            pool.putIfAbsent(hatColor, new LinkedHashMap<>());
            pool.get(hatColor).putIfAbsent(name, physics);

            if (pool.get(hatColor).get(name) < physics) {
                pool.get(hatColor).put(name, physics);
            }
            input = scanner.nextLine();
        }

        Map<String, Integer> dwarfs = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : pool.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                dwarfs.put(entry.getKey() + " " + entry2.getKey(), entry2.getValue());
            }
        }

        dwarfs.entrySet().stream()
                        .sorted((e1, e2) -> {
                            int sort = Integer.compare(e2.getValue(), e1.getValue());
                            if (sort == 0) {
                                String[] hat1 = e1.getKey().split(" ");
                                String[] hat2 = e2.getKey().split(" ");

                                String d1 = (hat1[0]);
                                String d2 = (hat2[0]);

                                sort = d1.compareTo(d2);

                            }
                            return sort;
                        }).forEach(e -> {
                            String[] toPrint = e.getKey().split(" ");
                    System.out.printf("(%s) %s <-> %d%n", toPrint[0], toPrint[1], e.getValue());
                });

    }
}
