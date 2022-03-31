package com.company.RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //>>(?<product>\w+)<<(?<price>\d+|\d+.\d+)!(?<quantity>\d+)        - 70/100
        //>>(?<product>[A-Z]*[a-z]*)<<(?<price>\d+\.?\d*)!(?<quantity>\d+) - 80/100
        //>>(?<product>[A-z]+)<<(?<price>\d+\.?\d*)!(?<quantity>\d+)       - 80/100
        //^>>(?<product>[A-z]+)<<(?<price>\d+\.?\d*)!(?<quantity>\d+)$     - 60/100
        //^>>(?<product>[A-Z]*[a-z]*)<<(?<price>\d+\.?\d*)!(?<quantity>\d+)$ 60/100
        //>>(?<product>[A-Za-z]+)<<(?<price>\d+\.?\d*)!(?<quantity>\d+)$   - 60/100
        //>>(?<product>[\w]+)<<(?<price>[\d.]+)!(?<quantity>\d+) -->
        //String.join --> 80/100    forEach --> 100/100

        String regex = ">>(?<product>[\\w]+)<<(?<price>[\\d.]+)!(?<quantity>[\\d]+)";

        String input = scanner.nextLine();
        List<String> productsList = new ArrayList<>();
        double moneySpent = 0.0;

        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                productsList.add(product);
                moneySpent += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        productsList.forEach(p -> System.out.println(p));
        // System.out.print(String.join(System.lineSeparator(), productsList));
        //System.out.println();
        System.out.printf("Total money spend: %.2f", moneySpent);

    }
}
