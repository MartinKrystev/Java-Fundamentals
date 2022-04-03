package com.company.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");
        String[] songs = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        Map<String, List<String>> singersMap = new LinkedHashMap<>();

        while (!input.equals("dawn")) {
            String[] command = input.split(", ");
            String currName = command[0];
            String currSong = command[1];
            String currAward = command[2];

            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(currName)) { // checks for the same name
                    for (int j = 0; j < songs.length; j++) {
                        if (songs[j].equals(currSong)) { // checks for the same song
                            boolean awardExist = false;
                            singersMap.putIfAbsent(currName, new ArrayList<>());
                            if (singersMap.get(currName).size() > 0) { // if the list is Empty...
                                for (String award : singersMap.get(currName)) {
                                    if (award.equals(currAward)) {
                                        awardExist = true;
                                    }
                                }
                            }
                            if (!awardExist) {
                                singersMap.get(currName).add(currAward);
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        if (singersMap.size() == 0) {
            System.out.println("No awards");
        } else {
            for (Map.Entry<String, List<String>> entry : singersMap.entrySet()) {
                entry.getValue().sort(Comparator.naturalOrder());
            }
        }
        singersMap.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d awards%n", e.getKey(), e.getValue().size());
                    e.getValue().forEach(v -> {
                        System.out.println("--" + v);
                    });
                });
    }
}

