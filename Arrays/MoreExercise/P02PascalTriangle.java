package com.company.Arrays.MoreExercise;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int arr[] = new int[num];
        int temp[] = new int[num];
        temp[0] = 1;
        arr[0] = 1;

        System.out.println("1");
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("");
            for (int k = 1; k < num; k++) {
                arr[k] = temp[k - 1] + temp[k];
            }
            arr[i] = 1;
            for (int l = 0; l <= i; l++) {
                System.out.print(arr[l] + " ");
                temp[l] = arr[l];
            }
            System.out.println();
        }
    }
}