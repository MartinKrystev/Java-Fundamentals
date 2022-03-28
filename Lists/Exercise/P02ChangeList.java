<<<<<<< HEAD
package com.company.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String nextLine = scanner.nextLine();
        while (!nextLine.equals("end")) {
            List<String> input = Arrays.stream(nextLine.split(" ")).collect(Collectors.toList());
            switch (input.get(0)) {
                case "Delete":
                    int currNum = Integer.parseInt(input.get(1));

                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) == currNum) {
                            numList.remove(i);
                            i--;
                        }
                    }
                    break;

                case "Insert":
                    int insertEl = Integer.parseInt(input.get(1));
                    int insertIndex = Integer.parseInt(input.get(2));

                    numList.add(insertIndex, insertEl);
                    break;
            }

            nextLine = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
=======
package com.company.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String nextLine = scanner.nextLine();
        while (!nextLine.equals("end")) {
            List<String> input = Arrays.stream(nextLine.split(" ")).collect(Collectors.toList());
            switch (input.get(0)) {
                case "Delete":
                    int currNum = Integer.parseInt(input.get(1));

                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) == currNum) {
                            numList.remove(i);
                            i--;
                        }
                    }
                    break;

                case "Insert":
                    int insertEl = Integer.parseInt(input.get(1));
                    int insertIndex = Integer.parseInt(input.get(2));

                    numList.add(insertIndex, insertEl);
                    break;
            }

            nextLine = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
