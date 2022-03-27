package com.company.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> theList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            switch (inputList.get(2)) {
                case "going!":
                    String nameGoing = inputList.get(0);
                    //Adding to the list...
                    if (!theList.contains(nameGoing)) {
                        theList.add(nameGoing);
                    } else {
                        System.out.printf("%s is already in the list!%n", nameGoing);
                    }
                    break;
                case "not":
                    String nameNotGoing = inputList.get(0);
                    //Removing from the list...
                    if (theList.contains(nameNotGoing)) {
                        theList.remove(nameNotGoing);
                    } else {
                        System.out.printf("%s is not in the list!%n", nameNotGoing);
                    }
                    break;
            }
        }
        for (String element : theList) {
            System.out.println(element);
        }
    }
}