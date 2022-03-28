package com.company.ObjectsAndClasses.Exercise;

import java.util.*;

public class P03OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();   // creating a new Object
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person currPerson = new Person(name, age); //creating and filling N-objects
            personList.add(currPerson);
        }

        List<Person> over30List = new ArrayList<>();   //creating object where {int ages > 30}
        for (Person person : personList) {
            if (person.getAge() > 30) {
                over30List.add(person);
            }
        }

       // Collections.sort(over30List, new SortByName()); //Using Comparator
        for (int i = 0; i < over30List.size(); i++) {
            System.out.println(over30List.get(i)); //result from *toString* Method
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

        public String toString() { // Without that Method --> com.company.ObjectsAndClasses.Exercise.P03OpinionPoll$Person@17a7cec2
            return this.name + " - " + this.age; // With it, returns the values as single string
        }
    }

    static class SortByName implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return a.name.compareTo(b.name);
        }
    }

}
