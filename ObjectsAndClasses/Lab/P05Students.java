package com.company.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) { //Constructor
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataArr = input.split(" ");

            String firstName = dataArr[0];
            String lastName = dataArr[1];
            String age = dataArr[2];
            String homeTown = dataArr[3];

            Student currStudent = new Student(firstName, lastName, age, homeTown);
            studentsList.add(currStudent);

            input = scanner.nextLine();
        }

        String searchTown = scanner.nextLine();

        for (Student element : studentsList) {
            if (element.getHomeTown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", element.getFirstName(), element.getLastName(), element.getAge());
            }
        }

    }
}
