package com.company.Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleSymbols(input);
    }

    public static void middleSymbols(String text) {
        char[] array = text.toCharArray();

        if (array.length % 2 == 0) {
            char[] newArr = new char[2];
            newArr[0] = array[(array.length / 2) - 1];
            newArr[1] = array[array.length / 2];
            System.out.println(newArr);
        } else {
            char[] newArr = new char[1];
            newArr[0] = array[array.length / 2];
            System.out.println(newArr);
        }
    }
}
