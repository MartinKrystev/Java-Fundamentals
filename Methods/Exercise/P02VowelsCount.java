package com.company.Methods.Exercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        vowelsCounter(inputText);
    }

    public static void vowelsCounter(String text) {
        char[] array = text.toCharArray();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A' || array[i] == 'a' || array[i] == 'E' || array[i] == 'e' || array[i] == 'O' ||
                    array[i] == 'o' || array[i] == 'I' || array[i] == 'i' || array[i] == 'U' || array[i] == 'u') {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
