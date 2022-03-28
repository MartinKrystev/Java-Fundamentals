package com.company.ObjectsAndClasses.MoreExercise;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P01CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        HashMap<String, Double> avgSalaryMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String email = "n/a";
            int age = -1;

            //fills the employeeList...
            if (input.length == 5) {
                if (parseIntOrNull(input[4]) != null) {
                    age = Integer.parseInt(input[4]);
                } else {
                    email = input[4];
                }

            } else if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            }
            Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], email, age);
            employeeList.add(employee);
        }

        //splits the diff employees to their own Department lists + HashMap (depName, Salary)...
        for (int i = 0; i < employeeList.size(); i++) {
            Department department = new Department(employeeList.get(i).getDepartment(), employeeList.get(i).getSalary());
            String currDepName = employeeList.get(i).getDepartment();
            double currDepSalary = employeeList.get(i).getSalary();
            departmentList.add(department);

            if (avgSalaryMap.containsKey(currDepName)) { // ... Sums the salary correctly !
                Double currentSalary = avgSalaryMap.get(currDepName);
                avgSalaryMap.put(currDepName, currDepSalary + currentSalary);
            } else {
                avgSalaryMap.put(currDepName, currDepSalary);
            }



        }
        System.out.println();

    }

    public static Integer parseIntOrNull(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static class Department {
        String name;
        //List<Employee> listOfEmployees;
        double salary;
        double avgSalary;

        public Department(String name, double salary) {
            this.name = name;
            this.salary = salary;
            //this.listOfEmployees = listOfEmployees;
            this.avgSalary = 0.0;   //listOfEmployees.stream().mapToDouble(Employee::getSalary).average().orElse(0.00);
        }

        public String getName() {
            return name;
        }

//        public List<Employee> getListOfEmployees() {
//            return listOfEmployees;
//        }


        public double getAvgSalary() {
            return avgSalary;
        }
    }

    static class Employee {
        String name;
        double salary;
        String position;
        String department;

        String email;
        int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return this.salary;
        }

        public String getDepartment() {
            return this.department;
        }

        public String toString() {
            return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
        }
    }
}
