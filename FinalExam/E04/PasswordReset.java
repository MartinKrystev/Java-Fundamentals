package com.company.FinalExam.E04;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "TakeOdd": //•	"TakeOdd"
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < text.length(); i++) {
                        if (i % 2 != 0) {
                            sb.append(text.charAt(i));
                        }
                    }
                    text = sb.toString();
                    System.out.println(text);
                    break;
                case "Cut": //•	"Cut {index} {length}"
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);

                    String toCut = text.substring(index, index + length);
                    text = text.replaceFirst(toCut, "");
                    System.out.println(text);
                    break;
                case "Substitute": //•	"Substitute {substring} {substitute}"
                    String oldPart = command[1];
                    String newPart = command[2];
                    if (text.contains(oldPart)) {
                        text = text.replaceAll(oldPart, newPart);
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + text);

    }
}
