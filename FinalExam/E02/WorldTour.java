package com.company.FinalExam.E02;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] command = input.split(":");

            switch (command[0]) {
                case "Add Stop":
                    int addIndex = Integer.parseInt(command[1]);
                    if (addIndex > -1 && addIndex < sb.length()) {
                        sb.insert(addIndex, command[2]);
                    }
                    System.out.println(sb);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if ((startIndex > -1 && startIndex < sb.length()) && (endIndex > -1 && endIndex < sb.length())) {
                        sb.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(sb);
                    break;
                case "Switch":
                    String oldString = command[1];
                    String newString = command[2];

                    String newText = String.valueOf(sb);
                    String replacedText = newText.replaceAll(oldString, newString);

                    System.out.println(replacedText);
                    sb = new StringBuilder(replacedText);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + sb);

    }
}
