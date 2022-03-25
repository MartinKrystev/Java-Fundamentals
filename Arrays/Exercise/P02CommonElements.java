package com.company.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        String common = "";
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
               if (secondArr[i].equals(firstArr[j])) {
                   common += secondArr[i];
                   if (i != secondArr.length -1) {
                       common += " ";
                   }
               }
            }
        }
        System.out.println(common);
    }
}
