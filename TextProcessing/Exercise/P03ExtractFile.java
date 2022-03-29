package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\.");

        String[] fileNameArr = input[0].split("\\\\");
        int index = fileNameArr.length - 1;

        System.out.println("File name: " + fileNameArr[index]);
        System.out.println("File extension: " + input[1]);
    }
}
