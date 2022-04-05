package com.company.FinalExam.E02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> placesList = new ArrayList<>();
        int points = 0;

        String regex = "([=\\/])(?<place>[A-Z][A-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String currPlace = matcher.group("place");
            placesList.add(currPlace);
            points += currPlace.length();
        }

        System.out.println("Destinations: " + String.join(", ", placesList));
        System.out.println("Travel Points: " + points);

    }
}
