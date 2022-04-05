package com.company.FinalExam.EXAM;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 03. Degustation Party <-------------------------------------
        String input = scanner.nextLine();
        Map<String, List<String>> guestsMap = new LinkedHashMap<>();
        int dislikeCount = 0;

        while (!input.equals("Stop")) {
            String[] command = input.split("-");

            switch (command[0]) {
                case "Like": //o	"Like-{guest}-{meal}"
                    String likeGuest = command[1];
                    String likeMeal = command[2];

                    guestsMap.putIfAbsent(likeGuest, new ArrayList<>());

                    if (guestsMap.get(likeGuest).size() == 0) {
                        guestsMap.get(likeGuest).add(likeMeal);
                    } else {
                        if (!guestsMap.get(likeGuest).contains(likeMeal)) {
                            guestsMap.get(likeGuest).add(likeMeal);
                        }
                    }
                    break;
                case "Dislike": //o	"Dislike-{guest}-{meal}"
                    String dislikeGuest = command[1];
                    String dislikeMeal = command[2];
                    if (!guestsMap.containsKey(dislikeGuest)) {
                        System.out.printf("%s is not at the party.%n", dislikeGuest);
                    } else {
                        if (guestsMap.get(dislikeGuest).contains(dislikeMeal)) {
                            dislikeCount++;
                            guestsMap.get(dislikeGuest).remove(dislikeMeal);
                            System.out.printf("%s doesn't like the %s.%n", dislikeGuest, dislikeMeal);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", dislikeGuest, dislikeMeal);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        guestsMap.forEach((key, value) -> {
            System.out.print(key + ": ");
            System.out.println(String.join(", ", value));
        });
        System.out.printf("Unliked meals: %d", dislikeCount);
    }
}
