package com.company.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bombPowerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bombNum = bombPowerList.get(0);     // 4
        int bombPower = bombPowerList.get(1);   // 2
        int sum = 0;
        //   1 2 2   4   2 2 2 9
        while (numList.contains(bombNum)) {
            int bombIndex = numList.indexOf(bombNum); // 3
            int left = Math.max(0, bombIndex - bombPower); // 1
            int right = Math.min(numList.size() - 1, bombIndex + bombPower); // 5

            for (int i = right; i >= left; i--) { // 5 --> 1 index
                numList.remove(i);
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        System.out.println(sum);
    }
}
