package com.company.BasicSyntax.CS.Loops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = Integer.parseInt(scanner.nextLine());
        int numB = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;
        int sumNum = 0;

        for (int i = numA; i <= numB; i++) {
            currentNum = i;
            System.out.print(currentNum + " ");
            sumNum += currentNum;
            currentNum++;
        }
        System.out.println();
        System.out.printf("Sum: %d",sumNum);
    }
}
