package com.company.Arrays.Exercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] numArr = new int[arr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        int rotations = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < rotations; j++) {
            int temp = numArr[0];
            for (int k = 0; k < numArr.length - 1; k++) { // in Changed Array  0->1, 1->2, 2->3...
                numArr[k] = numArr[k + 1];
            }
            numArr[numArr.length - 1] = temp; // gives the last index in the Changed Array
        }
        for (int l = 0; l < numArr.length; l++) {
            System.out.print(numArr[l]);
            if (l != numArr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}