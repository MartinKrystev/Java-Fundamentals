package com.company.FinalExam.E05;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {

            String[] command = input.split(">>>");
            switch (command[0]) {
                case "Contains": //•	"Contains>>>{substring}"
                    if (text.contains(command[1])) {
                        System.out.printf("%s contains %s%n", text, command[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":     //•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}"
                    int startIndex = Integer.parseInt(command[2]);
                    int endIndex = Integer.parseInt(command[3]);
                    String newSubstr = text.substring(startIndex, endIndex);
                    StringBuilder sb = new StringBuilder();

                    if (command[1].equals("Upper")) {
                        for (int i = 0; i < newSubstr.length(); i++) {
                            char symbol = newSubstr.charAt(i);
                            if (Character.isLowerCase(symbol)) {
                                char newSymbol = Character.toUpperCase(symbol);
                                sb.append(newSymbol);
                            } else {
                                sb.append(symbol);
                            }
                        }
                    } else if (command[1].equals("Lower")) {
                        for (int i = 0; i < newSubstr.length(); i++) {
                            char symbol = newSubstr.charAt(i);
                            if (Character.isUpperCase(symbol)) {
                                char newSymbol = Character.toLowerCase(symbol);
                                sb.append(newSymbol);
                            } else {
                                sb.append(symbol);
                            }
                        }
                    }
                    text = text.replace(newSubstr, sb.toString());
                    System.out.println(text);
                    break;
                case "Slice":    //•	"Slice>>>{startIndex}>>>{endIndex}"
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    String toCut = text.substring(firstIndex, secondIndex);
                    text = text.replace(toCut, "");
                    System.out.println(text);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + text);
    }
}
