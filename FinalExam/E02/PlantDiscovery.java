package com.company.FinalExam.E02;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plants> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String name = input[0];
            int rarity = Integer.parseInt(input[1]);

            if (plantsMap.containsKey(name)) {
                plantsMap.get(name).setRarity(rarity);
            } else {
                Plants currPlant = new Plants(name, rarity, new ArrayList<>());
                plantsMap.put(name, currPlant);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] command = input.split(": ");
            switch (command[0]) {
                case "Rate":
                    String[] commandLine = command[1].split(" - ");
                    String ratePlant = commandLine[0];
                    double rateRating = Double.parseDouble(commandLine[1]);

                    if (plantsMap.containsKey(ratePlant)) {
                        plantsMap.get(ratePlant).setRating(rateRating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] updateLine = command[1].split(" - ");
                    String updatePlant = updateLine[0];
                    int updateRarity = Integer.parseInt(updateLine[1]);

                    if (plantsMap.containsKey(updatePlant)) {
                        plantsMap.get(updatePlant).setRarity(updateRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlant = command[1];
                    if (plantsMap.containsKey(resetPlant)) {
                        plantsMap.get(resetPlant).setRating(new ArrayList<>());
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plants> entry : plantsMap.entrySet()) {
            System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), entry.getValue().getAverage());
        }
    }

    static class Plants {
        String plant;
        int rarity;
        List<Double> rating;

        public Plants(String plant, int rarity, List<Double> rating) {
            this.plant = plant;
            this.rarity = rarity;
            this.rating = rating;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void setRating(List<Double> rating) {
            this.rating = rating;
        }

        public void setRating(double rating) {
            this.rating.add(rating);
        }

        public int getRarity() {
            return rarity;
        }

        public double getAverage() {
            if (this.rating.size() == 0) {
                return 0.00;
            }
            int count = this.rating.size();
            double sum = 0.0;
            for (Double rating : this.rating) {
                sum += rating;
            }
            return sum / count;
        }
    }
}
