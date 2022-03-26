package com.company.Methods.MoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            System.out.print(tribRec(i) + " ");

        }
    }

    public static int tribRec(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else if (num == 3) {
            return 2;
        } else {
            return tribRec(num - 1) + tribRec(num - 2) + tribRec(num - 3);
        }
    }

}
