package com.company.MidExam.E02;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int emp1 = Integer.parseInt(scanner.nextLine());
        int emp2 = Integer.parseInt(scanner.nextLine());
        int emp3 = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = emp1 + emp2 + emp3;
        int students = Integer.parseInt(scanner.nextLine());

        int hoursPassed = 0;

        while (students > 0) {
            hoursPassed++;
            if (hoursPassed % 4 != 0) {
                students -= studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hoursPassed);

    }
}
