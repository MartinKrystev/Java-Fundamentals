package com.company.FinalExam.E03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int km = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt((input[2]));

            Car currCar = new Car(car, km, fuel);
            carList.add(currCar);
        }

        String nextInput = scanner.nextLine();
        while (!nextInput.equals("Stop")) {
            String[] command = nextInput.split(" : ");
            switch (command[0]) {
                case "Drive": //"Drive : {car} : {distance} : {fuel}":
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getCar().equals(command[1])) {
                            if (carList.get(i).getFuel() < Integer.parseInt(command[3])) {
                                System.out.println("Not enough fuel to make that ride");
                            } else {
                                carList.get(i).setFuel((carList.get(i).getFuel() - Integer.parseInt(command[3])));
                                carList.get(i).setKm((carList.get(i).getKm() + Integer.parseInt(command[2])));
                                System.out.printf("%s driven for %s kilometers. %s liters of fuel consumed.%n", carList.get(i).getCar(), command[2], command[3]);
                                if (carList.get(i).getKm() >= 100000) {
                                    System.out.printf("Time to sell the %s!%n", carList.get(i).getCar());
                                    carList.remove(carList.get(i));
                                }
                            }
                        }
                    }
                    break;
                case "Refuel": //"Refuel : {car} : {fuel}":
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getCar().equals(command[1])) {
                            if (carList.get(i).getFuel() + Integer.parseInt(command[2]) >= 75) {
                                System.out.printf("%s refueled with %d liters%n", carList.get(i).getCar(), 75 - carList.get(i).getFuel());
                                carList.get(i).setFuel(75);
                            } else {
                                System.out.printf("%s refueled with %s liters%n", carList.get(i).getCar(), command[2]);
                                carList.get(i).setFuel(carList.get(i).getFuel() + Integer.parseInt(command[2]));
                            }
                        }
                    }
                    break;
                case "Revert": //"Revert : {car} : {kilometers}":
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getCar().equals(command[1])) {
                            int currMileage = carList.get(i).getKm() - Integer.parseInt(command[2]);
                            if (currMileage > 10000) {
                                System.out.printf("%s mileage decreased by %s kilometers%n", carList.get(i).getCar(), command[2]);
                                carList.get(i).setKm(currMileage);
                            } else {
                                carList.get(i).setKm(10000);
                            }
                        }
                    }
                    break;
            }
            nextInput = scanner.nextLine();
        }

        for (Car car : carList) {
            System.out.println(car);
        }

    }

    static class Car {
        String car;
        int km;
        int fuel;

        public Car(String car, int km, int fuel) {
            this.car = car;
            this.km = km;
            this.fuel = fuel;
        }

        public String getCar() {
            return car;
        }

        public int getKm() {
            return km;
        }

        public void setKm(int km) {
            this.km = km;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", this.car, this.km, this.fuel);
        }
    }
}
