package com.company.ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringArr = input.split(" ");

        Random rndGenerator = new Random();
        for (int i = 0; i < stringArr.length; i++) {
            int x = rndGenerator.nextInt(stringArr.length);
            int y = rndGenerator.nextInt(stringArr.length);

            String oldElementX = stringArr[x];
            stringArr[x] = stringArr[y];
            stringArr[y] = oldElementX;
        }
        System.out.println(String.join(System.lineSeparator() , stringArr));
    }
}
