package com.company.MidExam.E02;

import java.math.BigDecimal;
import java.util.*;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        double total = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNumber = numbersArr[i];
            total = total + currentNumber;
        }
        //10 20 30 40 50
        double average = total / numbersArr.length;

        List<BigDecimal> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];

            if (currentNum > average) {
                topNumbers.add(BigDecimal.valueOf(currentNum));
            }
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
