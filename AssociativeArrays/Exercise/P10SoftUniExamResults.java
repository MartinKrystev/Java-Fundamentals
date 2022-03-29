package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> usersMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsMap = new LinkedHashMap<>();
        List<String> bannedUsers = new ArrayList<>();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");

            if (data.length == 2) { //ban the user
                String username = data[0];
                bannedUsers.add(data[0]);
                usersMap.remove(username);

            } else {
                String userName = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if (!bannedUsers.contains(userName)) { //check if the user is being banned already
                    if (!usersMap.containsKey(userName)) { //add to the usersMap
                        usersMap.put(userName, points);
                    } else {
                        if (usersMap.get(userName) < points) {
                            usersMap.put(userName, points);
                        }
                    }

                    if (!submissionsMap.containsKey(language)) { //add to the submissionsMap
                        submissionsMap.put(language, 1);
                    } else {
                        submissionsMap.put(language, submissionsMap.get(language) + 1);
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : usersMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissionsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
