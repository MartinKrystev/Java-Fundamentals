package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double allExpenses = 0.0;
        int keyboardCrashCount = 0;

        for (int i = 1; i <= gamesLost; i++) {

            if (i % 2 == 0) {
                allExpenses += headsetPrice;
            }
            if (i % 3 == 0) {
                allExpenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                allExpenses += keyboardPrice;
                keyboardCrashCount++;

                if (keyboardCrashCount % 2 == 0) {
                    allExpenses += displayPrice;
                }
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", allExpenses);
    }
}
