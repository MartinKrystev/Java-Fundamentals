package com.company.AssociativeArrays.MoreExercise;

import java.util.*;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, String> contestMap = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> usersMap = new TreeMap<>();

        while (!input.equals("end of contests")) {
            String[] data = input.split(":");
            String contest = data[0];
            String pass = data[1];
            contestMap.putIfAbsent(contest, pass);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] data = input.split("=>");
            String currContest = data[0];
            String currPass = data[1];
            String currUserName = data[2];
            int currUserPoints = Integer.parseInt(data[3]);

            if (contestMap.containsKey(currContest) && contestMap.get(currContest).equals(currPass)) {
                usersMap.putIfAbsent(currUserName, new TreeMap<>());
                usersMap.get(currUserName).putIfAbsent(currContest, 0);
                if (usersMap.get(currUserName).get(currContest) < currUserPoints) {
                    usersMap.get(currUserName).put(currContest, currUserPoints);
                }
            }
            input = scanner.nextLine();
        }

        int topSum = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : usersMap.entrySet()) {
            int currSum = entry.getValue().values().stream().mapToInt(e -> e).sum();
            if (currSum > topSum) {
                topSum = currSum;
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : usersMap.entrySet()) {
            if (entry.getValue().values().stream().mapToInt(e -> e).sum() == topSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", entry.getKey(), topSum);
            }
        }
        System.out.println("Ranking:");

        usersMap.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue())
                    .forEach(el -> System.out.printf("#  %s -> %d%n", el.getKey(), el.getValue()));
        });
    }
}
