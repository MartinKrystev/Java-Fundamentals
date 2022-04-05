package com.company.FinalExam.E01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Food> foodList = new ArrayList<>();
        int totalCalories = 0;

        String regex = "([#|])(?<item>[A-z]+ ?[A-z]? ?([A-z]+ ?[A-z]?)*)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            Food currFood = new Food(item, date, calories);
            foodList.add(currFood);
        }

        int survivingDays = totalCalories / 2000;

        if (survivingDays > 0) {
            System.out.printf("You have food to last you for: %d days!%n", survivingDays);
            for (Food food : foodList) {
                System.out.println(food);
            }
        } else {
            System.out.println("You have food to last you for: 0 days!");
        }

    }

    static class Food {
        String item;
        String date;
        int calories;

        public Food(String item, String date, int calories) {
            this.item = item;
            this.date = date;
            this.calories = calories;
        }

        public String getItem() {
            return item;
        }

        public String getDate() {
            return date;
        }

        public int getCalories() {
            return calories;
        }

        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.item, this.date, this.calories);
        }
    }
}
