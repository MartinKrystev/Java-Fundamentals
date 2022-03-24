package com.company.DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 0; i < n; i++) {
            int charValue = 0;
            String letter = "";

            char symbol = scanner.nextLine().charAt(0);
            charValue = key + symbol;
            letter = Character.toString(charValue);
            output += letter;
        }
        System.out.println(output);
    }
}
