package com.company.BasicSyntax.CS.Loops.MoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversed = "";

        char[] symbol = input.toCharArray();
        for (int i = symbol.length - 1; i >= 0; i--) {
            reversed += symbol [i];
        }
        System.out.println(reversed);
    }
}
