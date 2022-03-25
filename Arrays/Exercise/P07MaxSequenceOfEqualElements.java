package com.company.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int longest = 0;
        int currentValue = 0;
        int bestSeqIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            int currentCounter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentCounter++;
                    currentValue = arr[i];

                    if (currentCounter > longest) {
                        longest = currentCounter;
                        bestSeqIndex = currentValue;
                    }
                } else {
                    break;
                }

            }
        }

        for (int k = 0; k < longest; k++) {
            System.out.print(bestSeqIndex + " ");
        }
    }
}