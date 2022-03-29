package com.company.TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");
        List<String> finalList = new ArrayList<>();
        for (String s : text) {
            finalList.add(repeatString(s, s.length()));
        }
        System.out.println(String.join("", finalList));

    }

    public static String repeatString(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
