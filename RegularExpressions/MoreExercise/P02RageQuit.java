package com.company.RegularExpressions.MoreExercise;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<text>[\\D]+)(?<nums>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            String text = matcher.group("text").toUpperCase(Locale.ROOT);
            int times = Integer.parseInt(matcher.group("nums"));

            for (int i = 0; i < times; i++) {
                sb.append(text);
            }
        }

        HashSet<String> testHash = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            testHash.add(String.valueOf(sb.charAt(i)));
        }

        System.out.println("Unique symbols used: " + testHash.size());
        System.out.println(sb);
    }
}
