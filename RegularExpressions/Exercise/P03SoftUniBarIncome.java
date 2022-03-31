package com.company.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //^%(?<customer>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\w+)>[^|$%.]*\|(?<count>\d+)\|[^|$%.]*?(?<price>\d+\.?\d+)\$$
        double totalPrice = 0.0;
        while (!input.equals("end of shift")) {
            String regex = "^%(?<customer>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double singlePrice = Double.parseDouble(matcher.group("price"));

                double currPrice = count * singlePrice;
                totalPrice += currPrice;
                System.out.printf("%s: %s - %.2f%n", customer, product, currPrice);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
