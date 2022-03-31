package com.company.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "[A-z0-9]+[-._]?[A-z0-9]*@[a-z]+-?[a-z]*(\\.[a-z]+-?[a-z]*){1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String currEmail = matcher.group();
            System.out.println(currEmail);
        }

    }
}
