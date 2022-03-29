package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Double>> productsMap = new LinkedHashMap<>();
        List<Double> prices = new ArrayList<>();

        //Beer 2.20 100     IceTea 1.50 50     NukaCola 3.30 80    "{name} {price} {quantity}"
        while (!input.equals("buy")) {
            String[] currProduct = input.split(" ");

            String currKey = currProduct[0];               // name
            List<Double> currValue = new ArrayList<>();

            currValue.add(Double.valueOf(currProduct[1])); // price
            currValue.add(Double.valueOf(currProduct[2])); // quantity

            if (!productsMap.containsKey(currKey)) {
                productsMap.put(currKey, currValue);
            } else {
                List<Double> currPrice = productsMap.get(currKey); // price and quantity
                double newPrice = Double.parseDouble(currProduct[1]);
                double newQuantity = currPrice.get(1) + currValue.get(1);
                currPrice.set(0, newPrice);
                currPrice.set(1, newQuantity);
                productsMap.put(currKey,currPrice);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productsMap.entrySet()) {
            List<Double> currEntryPrice = entry.getValue();
            double currPrice = currEntryPrice.get(0) * currEntryPrice.get(1);
            System.out.printf("%s -> %.2f%n",entry.getKey(), currPrice);
        }


    }
}
