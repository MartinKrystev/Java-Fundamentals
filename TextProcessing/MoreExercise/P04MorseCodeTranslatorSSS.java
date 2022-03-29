package com.company.TextProcessing.MoreExercise;

import java.util.Scanner;

public class P04MorseCodeTranslatorSSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();
        //.. | -- .- -.. . | -.-- --- ..- | .-- .-. .. - . | .- | .-.. --- -. --. | -.-. --- -.. .
        //I MADE YOU WRITE A LONG CODE --> no, you did not :)

        char[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', ' '};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|",};

        for (int j = 0; j < text.length; j++) {
            for (int k = 0; k < morse.length; k++) {
                if (morse[k].equals(text[j])) {
                    sb.append(english[k]);
                }
            }
        }
        System.out.println(sb);
    }
}
