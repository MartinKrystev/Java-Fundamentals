package com.company.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> finalList = new ArrayList<>();
        //7 | 4  5|1 0| 2 5 |3
        for (int i = inputList.size() - 1; i >= 0; i--) {

            String[] numbers = inputList.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")) {
                    finalList.add(numbers[j]);
                }
            }
        }
        System.out.println(finalList.toString().trim().replaceAll("\\[|,|\\]", ""));

    }
}
