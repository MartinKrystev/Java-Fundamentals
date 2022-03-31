package com.company.RegularExpressions.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        List<String> goodList = new ArrayList<>();

        //@(?<name>[A-Z][a-z]+)[^-@!:>]*!(?<behavior>[A-Z])!


        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                char newSymbol = (char) (symbol - n);
                sb.append(newSymbol);
            }

            String regex = "@(?<name>[A-Za-z]+)[^-@!:>]*!(?<behavior>[A-Z])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);

            while (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");

                if (behavior.equals("G")) {
                    goodList.add(name);
                }
            }

            input = scanner.nextLine();
        }
        for (String name : goodList) {
            System.out.println(name);
        }
    }
}
