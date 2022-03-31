package com.company.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s*,+\\s*");

        for (int i = 0; i < input.length; i++) {
            String demonName = input[i];
            long health = 0;
            double damage = 0.0;

            //String demonName = currDemonName.replaceAll(" ", "");
            //String demonName1 = currDemonName.replaceAll(",", "");
            //([\\-+]?\\d+\\.\\d+|[\\-+]?\\d+)
            //(\d+\.?\d+)|(-\d+\.?\d+)|(\d+)|(-\d+)
            String regex = "([\\-+]?\\d+\\.\\d+|[\\-+]?\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(demonName);

            while (matcher.find()) {           // calculates Damage
                double currMatch = Double.parseDouble(matcher.group());
                damage += currMatch;
            }

            for (int j = 0; j < demonName.length(); j++) {     // calculates Health
                char symbol = demonName.charAt(j);

                if (symbol < 42 || 57 < symbol || symbol == 44) {
                    health += symbol;
                }
            }

            for (int j = 0; j < demonName.length(); j++) { // '*' and '/' in the order they appear in the text
                char symbol = demonName.charAt(j);
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }

}
