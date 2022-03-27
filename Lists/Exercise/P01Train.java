package com.company.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")) {
            List<String> command = Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());

            if (command.get(0).equals("Add")) {
                wagonsList.add(Integer.valueOf(command.get(1)));
            } else {
                boolean pplHaveEntered = false;
                int pplToWagon = Integer.parseInt(command.get(0));
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (capacity >= wagonsList.get(i) + pplToWagon) {
                        wagonsList.set(i, wagonsList.get(i) + pplToWagon);
                        i = -1;
                        pplHaveEntered = true;
                    }
                    if (pplHaveEntered) {
                        break;
                    }
                }
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
