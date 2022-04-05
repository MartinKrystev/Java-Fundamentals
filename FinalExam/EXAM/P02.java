package com.company.FinalExam.EXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 02. Message Decrypter <----------------------------------
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String regex = "^([%$])(?<message>[A-Z][a-z]{2,})\\1: \\[(?<num1>\\d+)\\]\\|\\[(?<num2>\\d+)\\]\\|\\[(?<num3>\\d+)\\]\\|$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            boolean isFound = false;

            while (matcher.find()) {
                isFound = true;
                String message = matcher.group("message");
                int num1 = Integer.parseInt(matcher.group("num1"));
                int num2 = Integer.parseInt(matcher.group("num2"));
                int num3 = Integer.parseInt(matcher.group("num3"));

                StringBuilder sb = new StringBuilder();
                sb.append((char) num1);
                sb.append((char) num2);
                sb.append((char) num3);
                System.out.printf("%s: %s%n", message, sb);

            }

            if (!isFound) {
                System.out.println("Valid message not found!");
            }
        }

    }
}
