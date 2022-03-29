package com.company.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasShadowmourne = false; //requires 250 Shards
        boolean hasValanyr = false;      //requires 250 Fragments
        boolean hasDragonwrath = false;  //requires 250 Motes

        int shards = 0;
        int fragments = 0;
        int motes = 0;

        Map<String, Integer> itemsMap = new LinkedHashMap<>();

        //123 silver 6 shards 8 shards 5 motes      9 fangs 75 motes 103 MOTES 8 Shards
        while (hasDragonwrath == false || hasValanyr == false || hasShadowmourne == false) {

            String[] inputArr = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < inputArr.length; i = i + 2) {
                String currMaterial = inputArr[i + 1];
                int currQuantity = Integer.parseInt(inputArr[i]);

                if (!itemsMap.containsKey(currMaterial)) {
                    itemsMap.put(currMaterial, currQuantity);
                } else {
                    itemsMap.put(currMaterial, itemsMap.get(currMaterial) + currQuantity);
                }

                switch (currMaterial) {
                    case "shards":
                        shards += currQuantity;
                        break;
                    case "fragments":
                        fragments += currQuantity;
                        break;
                    case "motes":
                        motes += currQuantity;
                        break;
                }

                if (shards >= 250) {
                    hasShadowmourne = true;
                    System.out.println("Shadowmourne obtained!");
                    itemsMap.put("shards", itemsMap.get("shards") - 250);
                    break;
                }
                if (fragments >= 250) {
                    hasValanyr = true;
                    System.out.println("Valanyr obtained!");
                    itemsMap.put("fragments", itemsMap.get("fragments") - 250);
                    break;
                }
                if (motes >= 250) {
                    hasDragonwrath = true;
                    System.out.println("Dragonwrath obtained!");
                    itemsMap.put("motes", itemsMap.get("motes") - 250);
                    break;
                }
            }
            if (hasShadowmourne || hasValanyr || hasDragonwrath) {
                break;
            }
        }

        if (itemsMap.get("shards") == null){
            itemsMap.put("shards", 0);
        }
        System.out.println("shards: " + itemsMap.get("shards"));

        if (itemsMap.get("fragments") == null){
            itemsMap.put("fragments", 0);
        }
        System.out.println("fragments: " + itemsMap.get("fragments"));

        if (itemsMap.get("motes") == null){
            itemsMap.put("motes", 0);
        }
        System.out.println("motes: " + itemsMap.get("motes"));

        itemsMap.remove("shards");
        itemsMap.remove("fragments");
        itemsMap.remove("motes");

        for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
