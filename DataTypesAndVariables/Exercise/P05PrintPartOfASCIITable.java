package com.company.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = start; i <= end ; i++) {
            char symbol = (char) i;
            result += symbol + " ";
        }
        System.out.println(result);
    }
}
