package com.company.ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class P02Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(scanner.nextLine());

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]) {
                case "Edit":
                    article.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.renameTitle(command[1]);
                    break;
            }
        }
        System.out.println(article);
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
