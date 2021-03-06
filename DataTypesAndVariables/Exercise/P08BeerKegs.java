package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = 0;
        String result = "";

        for (int i = 0; i < n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double kegVolume = Math.PI * (Math.pow(radius, 2) * height);

            if (kegVolume > biggestKeg) {
                biggestKeg = kegVolume;
                result = model;
            }
        }
        System.out.println(result);
    }
}
