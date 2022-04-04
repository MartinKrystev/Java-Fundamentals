package com.company.MidExam.EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        //1 4 5 9       Add 1      Remove 4    -->  Finish
        while (!input.equals("Finish")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add":
                    list.add(Integer.parseInt(command[1]));
                    break;

                case "Remove":
                    int counter = 0;
                    int removeValue = Integer.parseInt(command[1]);

                    caseRemove(counter, list, removeValue);
                    break;

                case "Replace":
                    int replaceCounter = 0;
                    int value = Integer.parseInt(command[1]);
                    int replacement = Integer.parseInt(command[2]);

                    caseReplace(replaceCounter, list, value, replacement);
                    break;
                case "Collapse":

                    int collapseValue = Integer.parseInt(command[1]);
                    list.removeIf(n -> n < collapseValue);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void caseRemove(int counter, List<Integer> list, int removeValue) {

        for (int i = 0; i < list.size(); i++) {
            if (counter < 1 && list.get(i) == removeValue) {
                list.remove(i);
                counter++;
            }
        }
    }

    public static void caseReplace(int replaceCounter, List<Integer> list, int value, int replacement) {
        for (int i = 0; i < list.size(); i++) {
            if (replaceCounter < 1 && list.get(i) == value) {
                list.set(i, replacement);
                replaceCounter++;
            }
        }
    }

}
