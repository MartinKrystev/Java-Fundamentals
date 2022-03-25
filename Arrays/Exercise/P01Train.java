package com.company.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nWagons = Integer.parseInt(scanner.nextLine());
        int[] peopleArr = new int[nWagons];
        int peopleSum = 0;

        for (int i = 0; i < nWagons; i++) {
            peopleArr[i] = Integer.parseInt(scanner.nextLine());
            peopleSum += peopleArr[i];
        }
        for (int i = 0; i < nWagons; i++) {
            System.out.print(peopleArr[i] + " ");
        }
        System.out.println();
        System.out.println(peopleSum);
    }
}
