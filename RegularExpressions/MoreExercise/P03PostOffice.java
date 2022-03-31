package com.company.RegularExpressions.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\|");

        String firstLetters = "";
        List<String> wordsList = new ArrayList<>();

        String firstRegex = "([*#&$%])(?<caps>[A-Z]+)\\1"; //finds the caps Letters
        Pattern firstPattern = Pattern.compile(firstRegex);
        Matcher firstMatcher = firstPattern.matcher(parts[0]);

        while (firstMatcher.find()) {
            firstLetters = firstMatcher.group("caps");
        }

        String secondRegex = "(?<first>\\d{2}):(?<second>\\d{2})"; // finds the next few letters
        Pattern secondPattern = Pattern.compile(secondRegex);
        Matcher secondMatcher = secondPattern.matcher(parts[1]);

        while (secondMatcher.find()) {
            int firstNum = Integer.parseInt(secondMatcher.group("first"));
            int wordLength = Integer.parseInt(secondMatcher.group("second"));

            for (int i = 0; i < firstLetters.length(); i++) {
                char capLetter = firstLetters.charAt(i);
                if (capLetter == firstNum) {
                    String[] thirdPart = parts[2].split(" ");
                    for (int j = 0; j < thirdPart.length; j++) {
                        String currWord = thirdPart[j];
                        if (currWord.charAt(0) == firstNum && currWord.length() == wordLength + 1) {
                            wordsList.add(currWord);
                            break;
                        }
                    }
                }

            }
        }

        for (int i = 0; i < firstLetters.length(); i++) {
            char capLetter = firstLetters.charAt(i);
            for (int j = 0; j < wordsList.size(); j++) {
                if (capLetter == wordsList.get(j).charAt(0)) {
                    System.out.println(wordsList.get(j));
                    wordsList.remove(j);
                    break;
                }
            }
        }

    }
}
