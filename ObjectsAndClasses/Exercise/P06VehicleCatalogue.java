package com.company.ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class P06VehicleCatalogue {
    static class Vehicle {
        String type;
        String model;
        String color;
        double hp;

        public Vehicle(String type, String model, String color, double hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public double getHp() {
            return this.hp;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> finalList = new ArrayList<>();
        String line = scanner.nextLine();
        double hpCars = 0;
        int carsCounter = 0;
        int truckCounter = 0;
        double hpTrucks = 0;

        while (!line.equals("End")) {
            String[] inputCars = line.split(" ");
            String type = inputCars[0];
            String model = inputCars[1];
            String color = inputCars[2];
            double hp = Double.parseDouble(inputCars[3]);

            if (type.equals("car")) {
                hpCars += hp;
                carsCounter++;
            } else {
                hpTrucks += hp;
                truckCounter++;
            }

            Vehicle vehicle = new Vehicle(type, model, color, hp);
            finalList.add(vehicle);

            line = scanner.nextLine();
        }

        while (!line.equals("Close the Catalogue")) {
            String model = line;

            for (Vehicle vehicle : finalList) {
                if (vehicle.getModel().equals(model)) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n", vehicle.getType().substring(0, 1)
                            .toUpperCase(Locale.ROOT) + vehicle.getType().substring(1), vehicle.getModel(), vehicle.getColor(), vehicle.getHp());
                }
            }
            line = scanner.nextLine();
        }

        Double totalCarHp = hpCars / carsCounter;
        Double totalTruckHp = hpTrucks / truckCounter;

        if (carsCounter > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", totalCarHp);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (truckCounter > 0) {
        System.out.printf("Trucks have average horsepower of: %.2f.", totalTruckHp);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
