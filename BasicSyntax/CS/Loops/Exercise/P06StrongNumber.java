package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int originalNumber = Integer.parseInt(input);
        int number = originalNumber;
        int allFacturial = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = number % 10;
            number /= 10;
            int digitFacturial = 1;

            for (int j = 1; j <= digit; j++) {
                digitFacturial *= j;
            }
            allFacturial += digitFacturial;

        }

        if (originalNumber == allFacturial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
