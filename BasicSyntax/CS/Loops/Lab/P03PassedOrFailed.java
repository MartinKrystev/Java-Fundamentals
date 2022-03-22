package com.company.BasicSyntax.CS.Loops.Lab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        if (input < 3) {
            System.out.println("Failed!");
        } else {
            System.out.println("Passed!");
        }
    }
}
