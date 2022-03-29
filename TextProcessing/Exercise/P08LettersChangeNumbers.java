package com.company.TextProcessing.Exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0.0;
        //A12b s17G
        String alphabetUpper = "0ABCDEFGHIJKLMNOPQRSTVXYZ";
        String alphabetLower = "0abcdefghijklmnopqrstvxyz";
        for (int i = 0; i < input.length; i++) {
            String currData = input[i];

            char firstLetter = currData.charAt(0);
            double currNum = Double.parseDouble(currData.substring(1, currData.length() - 1));

            char secondLetter = currData.charAt(currData.length() - 1);

            if (Character.isUpperCase(firstLetter)) { // divide
                int index = alphabetUpper.indexOf(firstLetter);
                currNum = currNum / index;
            } else { // multiply
                int index = alphabetLower.indexOf(firstLetter);
                currNum = currNum * index;
            }

            if (Character.isUpperCase(secondLetter)) { // subtract
                int index = alphabetUpper.indexOf(secondLetter);
                currNum = currNum - index;
            } else { // add
                int index = alphabetLower.indexOf(secondLetter);
                currNum = currNum + index;
            }
            sum = currNum + sum;
        }
        System.out.printf("%.2f", sum);

    }
}
