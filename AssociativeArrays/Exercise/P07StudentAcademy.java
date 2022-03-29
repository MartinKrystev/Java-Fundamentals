package com.company.AssociativeArrays.Exercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        List<Double> listGrades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsMap.putIfAbsent(name, new ArrayList<>());
            studentsMap.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double result = Arrays.stream(entry.getValue().stream()
                    .mapToDouble(g -> g)
                    .toArray())
                    .average().getAsDouble();

            if (result >= 4.5){
                System.out.printf("%s -> %.2f%n",entry.getKey(), result);
            }
        }
    }
}
