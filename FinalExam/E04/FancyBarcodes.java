package com.company.FinalExam.E04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            //(@#+)(?<barcode>[A-Z][a-zA-Z|0-9]{4,}[A-Z])(@#+)
            String regex = "(@#+)(?<barcode>[A-Z][a-zA-Z|0-9]{4,}[A-Z])(@#+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            StringBuilder sb = new StringBuilder();
            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                for (int j = 0; j < barcode.length(); j++) {
                    if (barcode.charAt(j) >= 48 && barcode.charAt(j) <= 57) {
                        sb.append(barcode.charAt(j));
                    }
                }

                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
