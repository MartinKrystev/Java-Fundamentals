package com.company.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[1];

            switch (input[0]) {
                case "register":
                    String plateNumber = input[2];
                    if (!cars.containsKey(name)) {
                        cars.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", cars.get(name));
                    }
                    break;
                case "unregister":
                    if (cars.containsKey(name)) {
                        System.out.printf("%s unregistered successfully%n", name);
                        cars.remove(name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
