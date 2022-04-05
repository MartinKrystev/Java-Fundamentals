package com.company.FinalExam.E05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<City> cities = new ArrayList<>();
        while (!input.equals("Sail")) {
            String[] command = input.split("\\|\\|");

            City currCity = new City(command[0], Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            boolean isMatched = false;
            boolean firstIsAdded = false;

            if (cities.isEmpty()) {
                cities.add(currCity);
                firstIsAdded = true;
            }

            if (!firstIsAdded) {
                for (int i = 0; i < cities.size(); i++) {
                    if (cities.get(i).getName().equals(command[0])) {
                        cities.get(i).setPopulation(cities.get(i).getPopulation() + Integer.parseInt(command[1]));
                        cities.get(i).setGold(cities.get(i).getGold() + Integer.parseInt(command[2]));
                        isMatched = true;
                        break;
                    }
                }
                if (!isMatched) {
                    cities.add(currCity);
                }
            }
            input = scanner.nextLine();
        }

        String event = scanner.nextLine();
        while (!event.equals("End")) {
            String[] command = event.split("=>");
            switch (command[0]) {
                case "Plunder": //•	"Plunder=>{town}=>{people}=>{gold}"
                    for (int i = 0; i < cities.size(); i++) {
                        if (cities.get(i).getName().equals(command[1])) {
                            int currPopulation = cities.get(i).getPopulation() - Integer.parseInt(command[2]);
                            int currGold = cities.get(i).getGold() - Integer.parseInt(command[3]);
                            System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n"
                                    , command[1], command[3], command[2]);
                            cities.get(i).setPopulation(currPopulation);
                            cities.get(i).setGold(currGold);
                            if (currGold <= 0 || currPopulation <= 0) {
                                System.out.printf("%s has been wiped off the map!%n", command[1]);
                                cities.remove(i);
                            }
                            break;
                        }

                    }
                    break;
                case "Prosper": //•	"Prosper=>{town}=>{gold}"
                    int currGold = Integer.parseInt(command[2]);
                    if (currGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        for (int i = 0; i < cities.size(); i++) {
                            if (cities.get(i).getName().equals(command[1])) {
                                cities.get(i).setGold(cities.get(i).getGold() + currGold);
                                System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                                        , currGold, cities.get(i).getName(), cities.get(i).getGold());
                            }
                        }
                    }
                    break;
            }

            event = scanner.nextLine();
        }
        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            for (int i = 0; i < cities.size(); i++) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                        , cities.get(i).getName(), cities.get(i).getPopulation(), cities.get(i).getGold());
            }
        }

    }

    static class City {
        String name;
        int population;
        int gold;

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public int getPopulation() {
            return population;
        }

        public int getGold() {
            return gold;
        }
    }
}
