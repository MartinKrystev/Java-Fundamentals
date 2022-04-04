package com.company.MidExam.E02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            //23 -2 321 87 42 90 -123
            switch (command[0]) {
                case "swap": //swap {index1} {index2}  ( 1 )  ( 2 )
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);

                    long element1 = list.get(index1);
                    long element2 = list.get(index2);

                    list.set(index1, element2);
                    list.set(index2, element1);
                    break;
                case "multiply": //multiply {index1} {index2}
                    int indexOne = Integer.parseInt(command[1]);
                    int indexTwo = Integer.parseInt(command[2]);

                    long sum = list.get(indexOne) * list.get(indexTwo);
                    list.set(indexOne, sum);
                    break;
                case "decrease":
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, list.get(i) - 1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
