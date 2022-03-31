package com.company.RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int attackedPlanets = 0;
        int destroyedPlanets = 0;
        List<String> atkPlanetsList = new ArrayList<>();
        List<String> desPlanetsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == 'S' || symbol == 'T' || symbol == 'A' || symbol == 'R' ||
                        symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                    count++;
                }
            }

            for (int j = 0; j < input.length(); j++) {
                int digit = input.charAt(j) - count;
                char newSymbol = (char) digit;
                sb.append(newSymbol);
            }

            String regex = "@(?<planet>[A-z]+)[^-@!:>]*:(?<population>\\d+)[^-@!:>]*!(?<ad>A|D)![^-@!:>]*->(?<soldiers>\\d+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);

            while (matcher.find()) {
                String planet = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String ad = matcher.group("ad");
                int soldiers = Integer.parseInt(matcher.group("soldiers"));

                if (ad.equals("A")) {
                    attackedPlanets++;
                    atkPlanetsList.add(planet);
                } else if (ad.equals("D")) {
                    destroyedPlanets++;
                    desPlanetsList.add(planet);
                }
            }

        }
        System.out.printf("Attacked planets: %d%n", attackedPlanets);
        if (attackedPlanets > 0) {
            atkPlanetsList.sort(Comparator.naturalOrder());
            for (int i = 0; i < atkPlanetsList.size(); i++) {
                System.out.printf("-> %s%n", atkPlanetsList.get(i));
            }
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets);
        if (destroyedPlanets > 0) {
            desPlanetsList.sort(Comparator.naturalOrder());
            for (int i = 0; i < desPlanetsList.size(); i++) {
                System.out.printf("-> %s%n", desPlanetsList.get(i));
            }
        }
    }
}
