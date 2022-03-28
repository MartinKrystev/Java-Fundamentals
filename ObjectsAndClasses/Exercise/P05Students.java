package com.company.ObjectsAndClasses.Exercise;

import java.util.*;

public class P05Students {
    static class SortByGrade implements Comparator<Student> {

        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.grade, a.grade);
        }
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> finalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName, lastName, grade);
            finalList.add(student);
        }

        Collections.sort(finalList, new SortByGrade());
        for (Student student : finalList) {
            System.out.println(student);
        }

    }
}
