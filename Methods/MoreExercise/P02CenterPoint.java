package com.company.Methods.MoreExercise;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosePoint(x1, y1, x2, y2);
    }

    public static void printClosePoint(int x1, int y1, int x2, int y2) {
        int firstPoint = Math.abs(x1 * x1 + y1 * y1);
        int secondPoint = Math.abs(x2 * x2 + y2 * y2);

        if (firstPoint <= secondPoint) {
            System.out.println("(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ")");
        }
    }
}
