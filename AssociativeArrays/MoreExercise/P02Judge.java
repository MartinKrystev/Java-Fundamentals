package com.company.AssociativeArrays.MoreExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> contestMap = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] data = input.split(" -> ");
            String name = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            contestMap.putIfAbsent(contest, new LinkedHashMap<>());
            contestMap.get(contest).putIfAbsent(name, points);

            if (contestMap.get(contest).get(name) < points) {
                contestMap.get(contest).put(name, points);
            }

            input = scanner.nextLine();
        }
        AtomicInteger counter = new AtomicInteger();

        contestMap.entrySet().stream()
                .forEach((el) -> {
                    System.out.printf("%s: %d participants%n", el.getKey(), el.getValue().size());
                    counter.set(1);
                    Map<String, Integer> usersMap = new LinkedHashMap<>();
                    usersMap = el.getValue();
                    usersMap.entrySet().stream()
                            .sorted((e1, e2) -> {
                                if (Objects.equals(e2.getValue(), e1.getValue())) {
                                    return e1.getKey().compareTo(e2.getKey());
                                } else {
                                    return e2.getValue() - e1.getValue();
                                }
                            })
                            .forEach((s) -> {
                                System.out.printf("%d. %s <::> %d%n", counter.getAndIncrement(), s.getKey(), s.getValue());
                            });
                });

        Map<String, Integer> standingsMap = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : contestMap.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                standingsMap.putIfAbsent(entry2.getKey(), 0);
                standingsMap.put(entry2.getKey(), standingsMap.get(entry2.getKey()) + entry2.getValue());
            }
        }

        System.out.println("Individual standings:");

        counter.set(1);

        standingsMap.entrySet().stream().sorted((e1, e2) -> {
            if (Objects.equals(e1.getValue(), e2.getValue())) {
                return e1.getKey().compareTo(e2.getKey());
            } else {
                return e2.getValue() - e1.getValue();
            }
        }).forEach( el -> {
            System.out.printf("%d. %s -> %d%n", counter.getAndIncrement(), el.getKey(), el.getValue());
        });
    }
}
