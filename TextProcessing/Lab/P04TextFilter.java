package com.company.TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWordsArr){
            if (text.contains(word)) {
                String replacementWord = repeatString("*", word.length());
                text = text.replace(word, replacementWord);
            }
        }
        System.out.println(text);

    }

    public static String repeatString (String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
