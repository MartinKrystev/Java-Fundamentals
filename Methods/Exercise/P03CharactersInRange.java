package com.company.Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printBetweenCharacters(first, second);
    }

    public static void printBetweenCharacters(char first, char second) {

        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");
        }

        for (int i = second + 1; i < first; i++) {
            System.out.print((char) i + " ");
        }
    }
}