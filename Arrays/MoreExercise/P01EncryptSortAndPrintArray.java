package com.company.Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] finalArray = new int[length];

        for (int i = 0; i < length; i++) {

            String input = scanner.nextLine();

            String[] array = input.split("");

           int sum = 0;
            for (int j = 0; j < array.length; j++) {
                char character = input.charAt(j);
                int vowels = 0;
                int consonants = 0;
                if (array[j].equals("A") || array[j].equals("a") || array[j].equals("E") || array[j].equals("e") ||
                        array[j].equals("I") || array[j].equals("i") || array[j].equals("O") || array[j].equals("o") ||
                        array[j].equals("U") || array[j].equals("u")) {
                    vowels += character * array.length;
                    sum += vowels;
                } else {
                    consonants += character / array.length;
                    sum += consonants;
                }
            }
            finalArray[i] = sum;
        }
        Arrays.sort(finalArray);
        for (int el : finalArray) {
            System.out.println(el);
        }
    }
}