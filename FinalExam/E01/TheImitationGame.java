package com.company.FinalExam.E01;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] command = input.split("\\|");

            switch (command[0]) {
                case "Move":
                    StringBuilder sb = new StringBuilder();
                    int digits = Integer.parseInt(command[1]);

                    String toBeMoved = text.substring(0, digits);
                    sb.append(text.substring(digits));
                    sb.append(toBeMoved);

                    text = String.valueOf(sb);
                    break;
                case "Insert":
                    StringBuilder sbForInsert = new StringBuilder();
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];

                    for (int i = 0; i < text.length(); i++) {
                        sbForInsert.append(text.charAt(i));
                    }

                    if (index > 0) {
                        sbForInsert.insert(index, value);
                    } else {
                        sbForInsert.insert(0, value);
                    }

                    text = String.valueOf(sbForInsert);
                    break;
                case "ChangeAll":
                    String substring = command[1];
                    String replacement = command[2];

                    int indexToChange = text.indexOf(substring);
                    while (indexToChange != -1) {
                        text = text.replace(substring, replacement);
                        indexToChange = text.indexOf(substring);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + text);
    }
}
