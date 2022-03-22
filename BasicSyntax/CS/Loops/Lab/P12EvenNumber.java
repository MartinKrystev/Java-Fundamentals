package com.company.BasicSyntax.CS.Loops.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

       while (input % 2 != 0) {
           System.out.printf("Please write an even number.%n");
           input = Integer.parseInt(scanner.nextLine());
       }
        System.out.printf("The number is: %d", Math.abs(input));
    }
}
