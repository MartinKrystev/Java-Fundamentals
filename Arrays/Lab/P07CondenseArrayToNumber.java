package com.company.Arrays.Lab;

import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");     // Стринг input в масив
        int[] numsArr = new int[inputArr.length];       // Нов Int масив от Стринг масива
        for (int i = 0; i < numsArr.length; i++) {      // Задава стойност на елементите в Int масива
            numsArr[i] = Integer.parseInt(inputArr[i]);
        }

        while (numsArr.length > 1) {
            int[] condensed = new int[numsArr.length - 1];  // С 1 елемент по-малко
            for (int i = 0; i < condensed.length; i++) {    // Итерации по елементите на Стария масив
                condensed[i] = numsArr[i] + numsArr[i + 1]; // Вземане на стойностите на 2 съседни елемента
            }
            numsArr = condensed;                            // Приравняване на Стария с Новия масив (length - 1)
        }
        System.out.println(numsArr[0]);
    }
}