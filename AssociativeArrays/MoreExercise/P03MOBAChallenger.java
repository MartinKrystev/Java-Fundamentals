package com.company.AssociativeArrays.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> pool = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            String[] dataArr = input.split(" ");
            if (dataArr.length == 5) {
                String player = dataArr[0];
                String position = dataArr[2];
                int skill = Integer.parseInt(dataArr[4]);

                if (!pool.containsKey(player)) {
                    pool.put(player, new LinkedHashMap<>());
                    pool.get(player).put(position, skill);
                } else {
                    if (pool.get(player).containsKey(position)) {
                        if (pool.get(player).get(position) < skill) {
                            pool.get(player).put(position, skill);
                        }
                    } else {
                        pool.get(player).put(position, skill);
                    }
                }
            } else {
                String player1 = dataArr[0];
                String player2 = dataArr[2];

                if (pool.containsKey(player1) && pool.containsKey(player2)) {
                    boolean haveCommon = false;
                    for (String s : pool.get(player1).keySet()) {
                        for (String s1 : pool.get(player2).keySet()) {
                            if (s.equals(s1)) {
                                haveCommon = true;
                            }
                        }
                    }
                    if (haveCommon) {
                        if (pool.get(player1).values().stream().mapToInt(x -> x).sum() > pool.get(player2).values().stream().mapToInt(x -> x).sum()) {
                            pool.remove(player2);
                        } else if (pool.get(player1).values().stream().mapToInt(x -> x).sum() < pool.get(player2).values().stream().mapToInt(x -> x).sum()) {
                            pool.remove(player1);
                        }
                    }
                }

            }
            input = scanner.nextLine();
        }
        pool.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int result = Integer.compare(e2.getValue().values().stream().mapToInt(x -> x).sum(), e1.getValue().values().stream().mapToInt(x -> x).sum());
                    if (result == 0) {
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n",entry.getKey(), entry.getValue().values().stream().mapToInt(x -> x).sum());
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int result = Integer.compare(e2.getValue(), e1.getValue());
                                if (result == 0) {
                                    result = e1.getKey().compareTo(e2.getKey());
                                }
                                return result;
                            })
                            .forEach(e -> {
                                System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue());
                            });
                });


    }
}
