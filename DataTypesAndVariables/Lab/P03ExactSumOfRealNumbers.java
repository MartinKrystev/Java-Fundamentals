package com.company.DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        BigDecimal exactSum = new BigDecimal(0);

        for (int i = 0; i < nums; i++) {
            BigDecimal currNum = new BigDecimal(scanner.nextLine());
            exactSum = exactSum.add(currNum);
        }
        System.out.println(exactSum);
    }
}
