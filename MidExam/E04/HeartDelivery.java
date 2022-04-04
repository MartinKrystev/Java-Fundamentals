package com.company.MidExam.E04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        //  10 10 10 2     ::      Jump 1  -->   Jump 2  -->    Love!         II test: 2 4 2
        int currJumpIndex = 0;
        int currIndex = 0;
        while (!input.equals("Love!")) {
            String[] jump = input.split(" ");

            int jumpIndex = Integer.parseInt(jump[1]) + currIndex;

            if (jumpIndex >= houses.size()) { // outside the list
                if (houses.get(0) == 0) {
                    System.out.printf("Place 0 already had Valentine's day.%n");
                } else {
                    houses.set(0, houses.get(0) - 2);
                    if (houses.get(0) == 0) {
                        System.out.printf("Place 0 has Valentine's day.%n");
                    }
                }
            } else {                          // inside the list
                if (houses.get(jumpIndex) == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", jumpIndex);
                } else {
                    int forDecreasing = houses.get(jumpIndex);
                    forDecreasing -= 2;
                    houses.set(jumpIndex, forDecreasing);
                    if (houses.get(jumpIndex) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", jumpIndex);
                    }
                }
            }
            if (jumpIndex < houses.size()) {
                currIndex = jumpIndex;
            } else {
                currIndex = 0;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currIndex);

        int failedHouses = 0;
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i) != 0) {
                failedHouses++;
            }
        }

        if (failedHouses == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedHouses);
        }
    }
}
