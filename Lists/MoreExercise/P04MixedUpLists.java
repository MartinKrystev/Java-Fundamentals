<<<<<<< HEAD
package com.company.Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //1  5  23 64 2  3  34   54 12 --> firstList
        //43 23 12 31 54 51 92         --> secondList
        List<Integer> remainingNums = new ArrayList<>();
        List<Integer> printList = new ArrayList<>();

        int length = Math.min(firstList.size(), secondList.size());

        if (firstList.size() > secondList.size()) {                            //check for the 2 remaining elements
            remainingNums.add(firstList.get(firstList.size() - 2));
            remainingNums.add(firstList.get(firstList.size() - 1));
            Collections.sort(remainingNums);
        } else {
            remainingNums.add(secondList.get(0));
            remainingNums.add(secondList.get(1));
            secondList.remove(secondList.get(1));
            secondList.remove(secondList.get(0));
            Collections.sort(remainingNums);
        }

        for (int i = 0; i < length; i++) {
            if (firstList.get(i) > remainingNums.get(0) && firstList.get(i) < remainingNums.get(1)) {
                printList.add(firstList.get(i));
            }
        }

        for (int i = 0; i < length; i++) {
            if (secondList.get(i) > remainingNums.get(0) && secondList.get(i) < remainingNums.get(1)) {
                printList.add(secondList.get(i));
            }
        }

        Collections.sort(printList);
        for (Integer el : printList) {
            System.out.print(el + " ");
        }
    }
}
=======
package com.company.Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //1  5  23 64 2  3  34   54 12 --> firstList
        //43 23 12 31 54 51 92         --> secondList
        List<Integer> remainingNums = new ArrayList<>();
        List<Integer> printList = new ArrayList<>();

        int length = Math.min(firstList.size(), secondList.size());

        if (firstList.size() > secondList.size()) {                            //check for the 2 remaining elements
            remainingNums.add(firstList.get(firstList.size() - 2));
            remainingNums.add(firstList.get(firstList.size() - 1));
            Collections.sort(remainingNums);
        } else {
            remainingNums.add(secondList.get(0));
            remainingNums.add(secondList.get(1));
            secondList.remove(secondList.get(1));
            secondList.remove(secondList.get(0));
            Collections.sort(remainingNums);
        }

        for (int i = 0; i < length; i++) {
            if (firstList.get(i) > remainingNums.get(0) && firstList.get(i) < remainingNums.get(1)) {
                printList.add(firstList.get(i));
            }
        }

        for (int i = 0; i < length; i++) {
            if (secondList.get(i) > remainingNums.get(0) && secondList.get(i) < remainingNums.get(1)) {
                printList.add(secondList.get(i));
            }
        }

        Collections.sort(printList);
        for (Integer el : printList) {
            System.out.print(el + " ");
        }
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
