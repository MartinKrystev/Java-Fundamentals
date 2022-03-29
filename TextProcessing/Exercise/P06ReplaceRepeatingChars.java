package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        sb.append(input.charAt(0));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != sb.charAt(sb.length() - 1)) {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
