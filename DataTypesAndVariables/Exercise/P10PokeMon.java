package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());
        int currentPower = power;
        int countPokes = 0;

        while (currentPower >= distance) {
            currentPower -= distance;
            countPokes++;

            if (currentPower == power / 2 && exhaustion > 0) {
                currentPower /= exhaustion;
            }
        }
        System.out.println(currentPower);
        System.out.println(countPokes);
    }
}
