package com.company.TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

            String name = text.substring(text.indexOf('@') + 1, text.indexOf('|'));
            String age = text.substring(text.indexOf('#') + 1, text.indexOf('*'));

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
