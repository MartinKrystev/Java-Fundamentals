package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double highestValue = 0.0;
        double snowballSnow = 0.0;
        double snowballTime = 0.0;
        double snowballQuality = 0.0;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow((snow / (double) time), quality);
            if (value > highestValue) {
                highestValue = value;
                snowballSnow = snow;
                snowballTime = time;
                snowballQuality = quality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",snowballSnow, snowballTime, highestValue, snowballQuality);
    }
}
