package com.company.MidExam.E04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Urgent":
                    String urgentItem = command[1];
                    if (!products.contains(urgentItem)) {
                        products.add(0, urgentItem);
                    }
                    break;
                case "Unnecessary":
                        products.removeIf(n -> (n.equals(command[1])));
                    break;
                case "Correct":
                    if (products.contains(command[1])) {
                        String correctItem = command[1];
                        String correctedItem = command[2];
                        Collections.replaceAll(products, correctItem, correctedItem);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(command[1])) {
                        String rearrangeItem = command[1];
                        products.remove(rearrangeItem);
                        products.add(rearrangeItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        products.toString().replaceAll("[\\[\\],]", "");

        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i));
            if (i != products.size() - 1){
                System.out.print(", ");
            }
        }

    }
}
