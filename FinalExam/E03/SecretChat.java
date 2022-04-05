package com.company.FinalExam.E03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");

            switch (command[0]) {
                case "InsertSpace":
                    int insIndex = Integer.parseInt(command[1]);
                    message = message.substring(0,insIndex) + " " + message.substring(insIndex);
                    System.out.println(message);
                    break;
                case "Reverse":
                    int index = message.indexOf(command[1]);
                    String replace = command[1];

                    if (!message.contains(command[1])) {
                        System.out.println("error");
                    } else {
                        String toReplace = new StringBuilder(replace).reverse().toString();
                        message = message.replaceFirst(Pattern.quote(replace), "") + toReplace;
                        System.out.println(message);
                    }
                    break;
                case "ChangeAll":
                    String replaceStr = command[1];
                    String replacement = command[2];

                    message = message.replace(replaceStr, replacement);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
