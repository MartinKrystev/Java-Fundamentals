package com.company.Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printSmallestNum(num1, num2, num3);
    }

    public static void printSmallestNum(int num1, int num2, int num3) {
        int smallestNum = Integer.MAX_VALUE;
        if (num1 <= smallestNum) {
            smallestNum = num1;
        }
        if (num2 <= smallestNum) {
            smallestNum = num2;
        }
        if (num3 <= smallestNum) {
            smallestNum = num3;
        }
        System.out.println(smallestNum);
    }
}
