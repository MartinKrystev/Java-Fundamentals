package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> usersMap = new LinkedHashMap<>();
        List<String> idList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String id = data[1];

            if (!usersMap.containsKey(company)) {
                usersMap.put(company, new ArrayList<>());
                usersMap.get(company).add(id);
            } else {
                List<String> currValue = usersMap.get(company);
                if (!currValue.contains(id)) {
                    usersMap.get(company).add(id);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : usersMap.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
