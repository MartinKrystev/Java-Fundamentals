package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int waterFilled = 0;
        for (int i = 0; i < n; i++) {
            int currentLitres = Integer.parseInt(scanner.nextLine());
            if (capacity < currentLitres) {
                System.out.println("Insufficient capacity!");
            } else {
                waterFilled += currentLitres;
                capacity -= currentLitres;
            }
        }
        System.out.println(waterFilled);
    }
}
