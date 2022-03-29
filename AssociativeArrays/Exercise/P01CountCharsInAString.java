package com.company.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String lettersOnly = text.replace(" ","");
        String[] textArr = lettersOnly.split("");

        Map<String, Integer> symbolsMap = new LinkedHashMap<>();

        for (String symbol : textArr) {
            String currLetter = symbol;

            if (!symbolsMap.containsKey(currLetter)) {
                symbolsMap.put(currLetter, 1);
            } else {
                symbolsMap.put(currLetter, symbolsMap.get(currLetter) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : symbolsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
