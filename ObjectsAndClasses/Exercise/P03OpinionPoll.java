package com.company.ObjectsAndClasses.Exercise;

import java.util.*;

public class P03OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person currPerson = new Person(name, age);
            personList.add(currPerson);
        }

        List<Person> over30List = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > 30) {
                over30List.add(person);
            }
        }

        for (int i = 0; i < over30List.size(); i++) {
            System.out.println(over30List.get(i));
        }

    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String toString() {
            return this.name + " - " + this.age;
        }
    }

    static class SortByName implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return a.name.compareTo(b.name);
        }
    }

}
