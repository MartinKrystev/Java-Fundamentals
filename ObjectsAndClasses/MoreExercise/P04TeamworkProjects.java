package com.company.ObjectsAndClasses.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04TeamworkProjects {
    static class Team {
        String creator;
        String team;

        public Team(String creator, String team) {
            this.creator = creator;
            this.team = team;
        }

        public String getCreator() {
            return creator;
        }

        public String getTeam() {
            return team;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<Team> teamList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] line = scanner.nextLine().split("-");
            String creator = line[0];
            String currTeam = line[1];

            Team team = new Team(creator, currTeam);
            teamList.add(team);

            for (int j = 0; j < teamList.size(); j++) {
                Team teamNow = teamList.get(j);

                if (teamNow.getTeam().equals(currTeam)) {
                    System.out.printf("Team %s was already created!%n", currTeam);
                    break;
                } else if (teamNow.getCreator().equals(creator)) {
                    System.out.printf("%s cannot create another team!%n", creator);
                    break;
                } else {
                }
            }

        }

        String line = scanner.nextLine();
        while (!line.equals("end of assignment")) {
            String[] currRequest = line.split("->");
            String currUser = currRequest[0];
            String currTeam = currRequest[1];

            Team test = new Team(currUser, currTeam);
            //boolean fieldExists = teamContainsField(test, )


            line = scanner.nextLine();
        }

    }

    public static boolean teamContainsField(Team currTeam, String fieldName) {
        return Arrays.stream(currTeam.getClass().getFields()).anyMatch(f -> f.getName().equals(fieldName));
    }
}
