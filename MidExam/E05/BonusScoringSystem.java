package com.company.MidExam.E05;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance = 0;
        double maxBonus = 0;

        for (int i = 1; i <= numberStudents; i++) {
            int attended = Integer.parseInt(scanner.nextLine());
            double bonus = ((1.0 * attended / numberLectures) * (5 + additionalBonus));
            if (maxBonus < bonus) {
                maxBonus = bonus;
                maxAttendance = attended;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
