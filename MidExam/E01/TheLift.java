package com.company.MidExam.E01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> lift = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < lift.size(); i++) {
            int currWagon = lift.get(i);
            if (currWagon < 4) {
                if (people >= 4 - currWagon) {
                    people -= 4 - currWagon;
                    currWagon = 4;
                    lift.set(i, 4);
                } else {
                    currWagon += people;
                    lift.set(i, currWagon);
                    people = 0;
                }
            }
        }

        boolean notFull = false;
        for (int i = 0; i < lift.size(); i++) {
            if (lift.get(i) < 4) {
                notFull = true;
                break;
            }
        }

        if (people > 0 && !notFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            System.out.println(lift.toString().replaceAll("[\\[\\],]", ""));
        } else if (people == 0 && notFull) {
            System.out.println("The lift has empty spots!");
            System.out.println(lift.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println(lift.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
