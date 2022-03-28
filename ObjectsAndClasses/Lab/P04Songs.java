package com.company.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song {
        String type;
        String name;
        String time;

//        Song(String type, String name, String time) {
//            this.type = type;
//            this.name = name;
//            this.time = time;
//        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song currSong = new Song();
            currSong.setType(type);
            currSong.setName(name);
            currSong.setTime(time);

            songList.add(currSong);

        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList) {
                if (item.getType().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }

    }
}
