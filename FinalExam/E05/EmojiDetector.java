package com.company.FinalExam.E05;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String digitRegex = "\\d";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(input);

        long coolThreshold = 1;
        while (digitMatcher.find()) {
            int digit = Integer.parseInt(digitMatcher.group());
            coolThreshold *= digit;
        }

        String emojiRegex = "([*]{2}|[:]{2})[A-Z][a-z]{2,}\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        List<String> emojisList = new ArrayList<>();
        int emojiCounter = 0;
        while (emojiMatcher.find()) {
            String currEmoji = emojiMatcher.group();
            emojiCounter++;
            int coolness = 0;

            for (int i = 2; i < currEmoji.length() - 2; i++) {
                char symbol = currEmoji.charAt(i);
                coolness += symbol;
            }
            if (coolness > coolThreshold) {
                emojisList.add(currEmoji);
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojiCounter + " emojis found in the text. The cool ones are:");
        for (int i = 0; i < emojisList.size(); i++) {
            if (i < emojisList.size() - 1) {
                System.out.println(emojisList.get(i) + " ");
            } else {
                System.out.println(emojisList.get(i));
            }
        }

    }
}
