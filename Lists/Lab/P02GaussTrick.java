package com.company.Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numList.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = numList.get(i);
            int secondNum = numList.get(numList.size() - 1);

            numList.set(i, firstNum + secondNum);
            numList.remove(numList.size() - 1);
        }
        System.out.println(joinElementsByDelimiter(numList, " "));
       // System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static String joinElementsByDelimiter(List<Integer> list, String delimiter) {
        String output = "";
        for (int element : list) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numDF = df.format(element) + delimiter;

            //output += new DecimalFormat (pattern: "0.#"). format(element) + delimiter;

            output += numDF;
        }
        return output;
    }
}
