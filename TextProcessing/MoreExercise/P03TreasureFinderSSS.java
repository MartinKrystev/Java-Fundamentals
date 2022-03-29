package com.company.TextProcessing.MoreExercise;

import java.util.Scanner;

public class P03TreasureFinderSSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keyArr = scanner.nextLine().split(" ");
        String text = scanner.nextLine();

        // 1  2  1  3
        while (!text.equals("find")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);

                if (i < keyArr.length) {
                    int key = Integer.parseInt(String.valueOf(keyArr[i]));
                    char newSymbol = (char) (symbol - key);
                    sb.append(newSymbol);
                } else {
                    int key = Integer.parseInt(String.valueOf(keyArr[i % keyArr.length]));
                    char newSymbol = (char) (symbol - key);
                    sb.append(newSymbol);
                }
            }
            String treasure = sb.substring(sb.indexOf("&") + 1, sb.lastIndexOf("&"));
            String coordinates = sb.substring(sb.indexOf("<") + 1, sb.lastIndexOf(">"));
            System.out.printf("Found %s at %s%n", treasure, coordinates);
            text = scanner.nextLine();
        }

    }
}
