package com.company.FinalExam.EXAM;

import java.util.Locale;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 01. Hogwarts  <---------------------------------------

        String spell = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Abjuration":
                    spell = spell.toUpperCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command[1]);
                    String letter = command[2];

                    if (index < 0 || index >= spell.length()) {
                        System.out.println("The spell was too weak.");
                    } else {
                        StringBuilder sb = new StringBuilder(spell);
                        StringBuilder newSb = new StringBuilder(sb.substring(0, index));
                        newSb.append(letter);
                        newSb.append(sb.substring(index + 1));
                        System.out.println("Done!");
                        spell = newSb.toString();
                    }
                    break;
                case "Divination":
                    String firstSub = command[1];
                    String secondSub = command[2];
                    if (spell.contains(firstSub)) {
                        spell = spell.replaceAll(firstSub, secondSub);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String substring = command[1];
                    if (spell.contains(substring)) {
                        spell = spell.replaceAll(substring, "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
