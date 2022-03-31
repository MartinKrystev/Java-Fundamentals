package com.company.RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 70/100

        String[] input = scanner.nextLine().split("\\s*,\\s*");
                        //"(\@{6,10}|\${6,10}|\^{6,10}|\#{6,10})"     ([@]{6,}|[#]{6,}|[\^]{6,}|[\$]{6,})
        String regex = "[@]{6,}|[#]{6,}|[\\^]{6,}|[\\$]{6,}";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < input.length; i++) {
            String ticket = input[i];

            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                String firstHalf = ticket.substring(0, 10);
                String secondHalf = ticket.substring(10);

                String firstWinner = "";
                String secondWinner = "";

                Matcher matcherFirst = pattern.matcher(firstHalf);
                while (matcherFirst.find()) {
                    firstWinner = matcherFirst.group();
                }

                Matcher matcherSecond = pattern.matcher(secondHalf);
                while (matcherSecond.find()) {
                    secondWinner = matcherSecond.group();
                }

                int minLength = Math.min(firstWinner.length(), secondWinner.length());
                String first = firstWinner.substring(0, minLength);
                String second = secondWinner.substring(0, minLength);

                if (firstWinner.length() < 6 || secondWinner.length() < 6 || !first.equals(second)) {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                } else if (first.length() == 10) {
                    System.out.printf("ticket \"%s\" - 10%s Jackpot!%n", ticket, first.charAt(0));
                } else {
                    System.out.printf("ticket \"%s\" - %d%c%n", ticket, minLength, first.charAt(0));
                }
            }

        }
    }
}
