package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        boolean isPassFound = false;

        char[] symbol = username.toCharArray();
        for (int i = symbol.length - 1; i >= 0; i--)
            password = password + symbol[i];

        for (int k = 1; k <= 4; k++) {
            String input2 = scanner.nextLine();
            if (input2.equals(password)) {
                System.out.printf("User %s logged in.", username);
                isPassFound = true;
                break;
            } else if (k!=4){
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (isPassFound == false) {
            System.out.printf("User %s blocked!", username);
        }

    }
}
