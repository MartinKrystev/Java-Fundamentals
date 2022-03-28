<<<<<<< HEAD
package com.company.Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        //9992 562 8933 --> 29, 13 ,23 sumIndex
        //This is some message for you --> 28 length
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            String currNum = numbers.get(i);
            List<Integer> currNumList = Arrays.stream(currNum.split(""))
                    .map(Integer::parseInt).collect(Collectors.toList());

            int currSumIndex = 0;
            for (int j = 0; j < currNum.length(); j++) {
                currSumIndex += currNumList.get(j);
            }

            if (currSumIndex < text.size()) {
                resultList.add(text.get(currSumIndex));
                text.remove(currSumIndex);
            } else {
                currSumIndex = currSumIndex % text.size();
                resultList.add(text.get(currSumIndex));
                text.remove(currSumIndex);
            }
        }
        for (String el : resultList) {
            System.out.printf("%s", el);
        }
    }
}
=======
package com.company.Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        //9992 562 8933 --> 29, 13 ,23 sumIndex
        //This is some message for you --> 28 length
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            String currNum = numbers.get(i);
            List<Integer> currNumList = Arrays.stream(currNum.split(""))
                    .map(Integer::parseInt).collect(Collectors.toList());

            int currSumIndex = 0;
            for (int j = 0; j < currNum.length(); j++) {
                currSumIndex += currNumList.get(j);
            }

            if (currSumIndex < text.size()) {
                resultList.add(text.get(currSumIndex));
                text.remove(currSumIndex);
            } else {
                currSumIndex = currSumIndex % text.size();
                resultList.add(text.get(currSumIndex));
                text.remove(currSumIndex);
            }
        }
        for (String el : resultList) {
            System.out.printf("%s", el);
        }
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
