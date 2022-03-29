package com.company.AssociativeArrays.Exercise;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> resourceMap = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String currResource = input;
            double currQuantity = Double.parseDouble(scanner.nextLine());

            if (!resourceMap.containsKey(currResource)) {
                resourceMap.put(currResource, currQuantity);
            } else {
                resourceMap.put(currResource, resourceMap.get(currResource) + currQuantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : resourceMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.printf("%s -> %s%n", entry.getKey(), df.format(entry.getValue()));
        }
    }
}
