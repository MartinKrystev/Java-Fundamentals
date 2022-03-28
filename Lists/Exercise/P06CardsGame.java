package com.company.Lists.Exercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //20 30 40 50
        //10 20 30 40
        int smallerDeck = 1;
        while (smallerDeck > 0) {

            if (firstDeck.get(0) > secondDeck.get(0)) {
                firstDeck.add(firstDeck.get(0));
                firstDeck.remove(0);
                firstDeck.add(secondDeck.get(0));
                secondDeck.remove(0);
            } else if (secondDeck.get(0) > firstDeck.get(0)) {
                secondDeck.add(secondDeck.get(0));
                secondDeck.remove(0);
                secondDeck.add(firstDeck.get(0));
                firstDeck.remove(0);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }

            if (firstDeck.size() <= secondDeck.size()) {
                smallerDeck = firstDeck.size();
            } else {
                smallerDeck = secondDeck.size();
            }
        }

        double sum = 0.0;
        DecimalFormat df = new DecimalFormat("0.##");

        if (firstDeck.size() > secondDeck.size()) {
            for (int i = 0; i < firstDeck.size(); i++) {
                sum += firstDeck.get(i);
            }
            System.out.println("First player wins! Sum: " + df.format(sum));
        } else {
            for (int i = 0; i < secondDeck.size(); i++) {
                sum += secondDeck.get(i);
            }
            System.out.println("Second player wins! Sum: " + df.format(sum));
        }

    }
}
