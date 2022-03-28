package com.company.ObjectsAndClasses.Exercise;

import java.util.*;

public class P07OrderByAge {
    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, id, age);
        }
    }

    static class SortedByAge implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return a.age - b.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Person> finalList = new ArrayList<>();
        while (!line.equals("End")) {
            String[] input = line.split(" ");

            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(name, id, age);
            finalList.add(person);

            line = scanner.nextLine();
        }

        Collections.sort(finalList, new SortedByAge());
        for (Person person : finalList) {
            System.out.println(person);
        }

    }
}
