package com.company.Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> currDrumSet = new ArrayList<>();          //copy of the initial drumSet
        currDrumSet.addAll(drumSet);
        // 58 65 33 --> drumSet         11, 12, 18, 10 --> hitPower         1000.00 --> savings
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            int currDrumQuality = 0;

            for (int i = 0; i < currDrumSet.size(); i++) {      //applying the hitPower on each drum
                boolean isBroken = false;
                currDrumQuality = currDrumSet.get(i) - hitPower;

                if (currDrumQuality > 0) {
                    currDrumSet.set(i, currDrumQuality);
                } else {
                    currDrumSet.set(i, 0);
                    isBroken = true;
                }

                if (isBroken) {                             //the drum breaks
                    if (savings >= 3 * drumSet.get(i)) {
                        savings -= 3 * drumSet.get(i);
                        currDrumSet.set(i, drumSet.get(i));
                    }
                }
            }
            input = scanner.nextLine();
        }

        currDrumSet.removeIf(n -> n == 0);
        for (Integer el : currDrumSet) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv. ", savings);
    }
}
