package com.company.FinalExam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] timeLeaving = scanner.nextLine().split(":");
        int steps = Integer.parseInt(scanner.nextLine());
        int secondsPerStep = Integer.parseInt(scanner.nextLine());

        long secondsToAdd = (long) steps * secondsPerStep;

        int hours = Integer.parseInt(timeLeaving[0]);
        int minutes = Integer.parseInt(timeLeaving[1]);
        int seconds = Integer.parseInt(timeLeaving[2]);

        String timePattern = "HH:mm:ss";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(timePattern);

        LocalTime testTime = LocalTime.of(hours, minutes, seconds).plusSeconds(secondsToAdd);
        System.out.println("Time Arrival: " + timeFormatter.format(testTime));
    }
}
