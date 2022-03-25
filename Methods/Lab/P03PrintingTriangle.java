package com.company.Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) { // going up
            printLine(1, i);
        }

        for (int i = num - 1; i >= 1 ; i--) { // going down
            printLine(1, i);
        }


    }
    public static void printLine(int start, int end) { // creates a single line
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
