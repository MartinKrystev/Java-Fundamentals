package com.company.TextProcessing.MoreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol > c1 && symbol < c2) {
                sum += symbol;
            }
        }
        System.out.println(sum);

    }
}
