package com.company.RegularExpressions.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> racersMap = new LinkedHashMap<>();

        String[] racersArr = scanner.nextLine().split(", ");

        for (String racer : racersArr) {
            racersMap.putIfAbsent(racer, 0);
        }

        String input = scanner.nextLine();

        String letterRegex = "[A-Z]|[a-z]";
        String digitRegex = "[0-9]";

        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();

            Pattern letterPattern = Pattern.compile(letterRegex);
            Matcher letterMatcher = letterPattern.matcher(input);

            while (letterMatcher.find()) { // finds the letters...
                String letter = letterMatcher.group();
                nameBuilder.append(letter);
            }
            String currName = String.valueOf(nameBuilder);

            for (String racer : racersArr) {
                if (racer.equals(currName)) { // if there is a match...
                    StringBuilder distanceBuilder = new StringBuilder();

                    Pattern digitPattern = Pattern.compile(digitRegex);
                    Matcher digitMatcher = digitPattern.matcher(input);

                    while (digitMatcher.find()) { // finds the digits...
                        String digits = digitMatcher.group();
                        distanceBuilder.append(digits);
                    }

                    int currDistance = 0;
                    String digits = String.valueOf(distanceBuilder);
                    for (int i = 0; i < digits.length(); i++) { // sums the distance...
                        char symbol = digits.charAt(i);
                        int currDigit = symbol - '0';
                        currDistance += currDigit;
                    }

                    if (racersMap.get(currName) < currDistance) {
                        racersMap.put(currName, currDistance);
                    } else {
                        racersMap.put(currName, racersMap.get(currName) + currDistance);
                    }
                }
            }


            input = scanner.nextLine();
        }
        Map<String, Integer> finalMap = new LinkedHashMap<>();
        racersMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .forEach(e -> {
                    finalMap.putIfAbsent(e.getKey(), e.getValue());
                });

        int counter = 1;


        for (Map.Entry<String, Integer> entry : finalMap.entrySet()) {
            if (counter == 1) {
                System.out.println("1st place: " + entry.getKey());
            }
            if (counter == 2) {
                System.out.println("2nd place: " + entry.getKey());
            }
            if (counter == 3) {
                System.out.println("3rd place: " + entry.getKey());
                break;
            }
            counter++;
        }


    }
}

