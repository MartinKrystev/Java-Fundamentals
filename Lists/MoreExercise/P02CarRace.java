<<<<<<< HEAD
package com.company.Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //29 13 9 0 13    0    21 0 14 82 12
        double leftCar = 0.0;
        double rightCar = 0.0;

        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < numList.size() / 2; i++) {
            leftSum += numList.get(i);
            if (numList.get(i) == 0) {
                leftSum *= 0.8;
            }
            leftCar = leftSum;
        }

        for (int i = numList.size() - 1; i > numList.size() / 2; i--) {
            rightSum += numList.get(i);
            if (numList.get(i) == 0) {
                rightSum *= 0.8;
            }
            rightCar = rightSum;
        }
        if (leftCar < rightCar) {
            System.out.printf("The winner is left with total time: %.1f", leftCar);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightCar);
        }
    }
}
=======
package com.company.Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //29 13 9 0 13    0    21 0 14 82 12
        double leftCar = 0.0;
        double rightCar = 0.0;

        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < numList.size() / 2; i++) {
            leftSum += numList.get(i);
            if (numList.get(i) == 0) {
                leftSum *= 0.8;
            }
            leftCar = leftSum;
        }

        for (int i = numList.size() - 1; i > numList.size() / 2; i--) {
            rightSum += numList.get(i);
            if (numList.get(i) == 0) {
                rightSum *= 0.8;
            }
            rightCar = rightSum;
        }
        if (leftCar < rightCar) {
            System.out.printf("The winner is left with total time: %.1f", leftCar);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightCar);
        }
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
