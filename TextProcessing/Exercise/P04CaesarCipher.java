package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);  // takes the current char
            int newSymbol = symbol + 3;     // takes the new ASCII value
            char newChar = (char) newSymbol;// turn the new value back to char
            sb.append(newChar);

        }
        System.out.println(sb);

    }
}
