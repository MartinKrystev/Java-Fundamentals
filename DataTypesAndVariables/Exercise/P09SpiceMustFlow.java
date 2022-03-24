package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spiceToMine = Integer.parseInt(scanner.nextLine());
        int counterDays = 0;
        int spiceMined = 0;

        if (spiceToMine >= 100) {

            for (int i = spiceToMine; i >= 100; i -= 10) {
                spiceMined += i;
                spiceMined -= 26; //workers per day
                counterDays++;
            }
            spiceMined -= 26; //the mine has been exhausted

            System.out.println(counterDays);
            System.out.println(spiceMined);
        } else {
            System.out.println(counterDays);
            System.out.println(spiceMined);
        }

    }
}
