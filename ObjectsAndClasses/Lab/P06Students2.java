package com.company.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
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


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataArr = input.split(" ");

            String firstName = dataArr[0];
            String lastName = dataArr[1];
            String age = dataArr[2];
            String homeTown = dataArr[3];

            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName, age, homeTown);
            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }
            input = scanner.nextLine();
        }

        String searchTown = scanner.nextLine();

        for (Student element : students) {
            if (element.getHomeTown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", element.getFirstName(), element.getLastName(), element.getAge());
            }
        }
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student element : students) {
            if (element.getFirstName().equals(firstName) && element.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName, String age, String homeTown) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.homeTown = homeTown;
            }
        }
        return existingStudent;
    }

}
