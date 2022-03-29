package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        //01234567890123456
        //abv>1>1>2>2asdasd
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            sb.append(symbol);

            if (symbol == '>') {
                i++;
                int range = text.charAt(i) - '0';

                int j = i;
                for (; j < i + range && j < text.length(); j++) {
                    if (text.charAt(j) == '>') {
                        sb.append('>');
                        j++;
                        range += (text.charAt(j) - '0') + 1;
                    }
                }
                i = j - 1;
            }
        }
        System.out.println(sb);
    }
}

