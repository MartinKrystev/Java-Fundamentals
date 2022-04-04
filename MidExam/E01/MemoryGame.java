package com.company.MidExam.E01;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int countGuesses = 0;
        //1 1 2 2 3 3 4 4 5 5
        boolean win = false;
        while (!input.equals("end")) {
            List<Integer> guess = Arrays.stream(input.split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList());
            countGuesses++;


            if (guess.get(0) < 0 || guess.get(0) >= list.size() || guess.get(1) < 0 || guess.get(1) >= list.size()
                    || (Objects.equals(guess.get(0), guess.get(1)))) {
                System.out.println("Invalid input! Adding additional elements to the board");
                list.add(list.size() / 2, "-" + countGuesses + "a");
                list.add((list.size() / 2) + 1, "-" + countGuesses + "a");

            } else {
                int indexOne = guess.get(0);
                int indexTwo = guess.get(1);

                if (list.get(indexOne).equals(list.get(indexTwo))) {
                    String matchingElement = list.get(indexOne);
                    if (list.removeIf(n -> n.equals(list.get(indexOne)))) {
                        System.out.printf("Congrats! You have found matching elements - %s!%n", matchingElement);
                    }
                } else {
                    System.out.println("Try again!");
                }
            }

            if (list.isEmpty()) {
                win = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (win) {
            System.out.printf("You have won in %d turns!", countGuesses);
        } else {
            System.out.print("Sorry you lose :(");
            System.out.println();
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
