package com.company.FinalExam.E03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#@]{1})(?<word1>[A-z]{3,})\\1\\1(?<word2>[A-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> wordsList = new ArrayList<>();
        int counter = 0;
        while (matcher.find()) {
            counter++;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            String reversedWord2 = new StringBuilder(word2).reverse().toString();
            if (word1.equals(reversedWord2)) {
                wordsList.add(word1 + " <=> " + word2);
            }

        }
        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(counter + " word pairs found!");
        }
        if (wordsList.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", wordsList));
        }
    }
}
