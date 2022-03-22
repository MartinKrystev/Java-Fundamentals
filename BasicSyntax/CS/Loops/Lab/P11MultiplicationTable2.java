package com.company.BasicSyntax.CS.Loops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i <= 10; i++) {
            int result = input * i;
            System.out.printf("%d X %d = %d%n", input, i, result);
        }
        if (multiplier > 10) {
            System.out.printf("%d X %d = %d%n", input, multiplier, (input * multiplier));
        }
    }
}
