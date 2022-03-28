<<<<<<< HEAD
package com.company.Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }
//3 5 2 43 12 3 54 10 23
//76 5 34 2 4 12
        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
=======
package com.company.Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }
//3 5 2 43 12 3 54 10 23
//76 5 34 2 4 12
        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
