package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        List<String> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] currStudent = input.split(":");
            String course = currStudent[0].trim();
            String name = currStudent[1];

            if (!coursesMap.containsKey(course)) {
                coursesMap.put(course, new ArrayList<>());
                coursesMap.get(course).add(name);
            } else {
                coursesMap.get(course).add(name);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            List<String> currValue = entry.getValue();
            for (int i = 0; i < currValue.size(); i++) {
                System.out.printf("--%s%n", currValue.get(i));
            }
        }

    }
}
