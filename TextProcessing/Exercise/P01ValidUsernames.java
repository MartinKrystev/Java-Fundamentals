package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String user : input) {
            if (isValid(user)) {
                System.out.println(user);
            }
        }

    }

    public static boolean isValid(String user) {
        if (user.length() < 3 || user.length() > 16) {
            return false;
        }

        for (int i = 0; i < user.length(); i++) {
            char symbol = user.charAt(i);

            if (!Character.isLetterOrDigit(symbol) && symbol != 45 && symbol != 95) {
                return false;
            }
        }
        return true;
    }
}
