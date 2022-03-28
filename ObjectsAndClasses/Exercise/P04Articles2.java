package com.company.ObjectsAndClasses.Exercise;

import java.util.*;

public class P04Articles2 {
//    static class SortByTitle implements Comparator<Article> {
//
//        @Override
//        public int compare(Article a, Article b) {
//            return a.title.compareTo(b.title);
//        }
//    }
//
//    static class SortByContent implements Comparator<Article> {
//
//        @Override
//        public int compare(Article a, Article b) {
//            return a.content.compareTo(b.content);
//        }
//    }
//
//    static class SortByAuthor implements Comparator<Article> {
//
//        @Override
//        public int compare(Article a, Article b) {
//            return a.author.compareTo(b.author);
//        }
//    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> finalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");

            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            finalList.add(article);
        }

        String command = scanner.nextLine(); //("{title}, {content}, {author}")
//        switch (command) {
//            case "title":
//                Collections.sort(finalList, new SortByTitle());
//                break;
//            case "content":
//                Collections.sort(finalList, new SortByContent());
//                break;
//            case "author":
//                Collections.sort(finalList, new SortByAuthor());
//                break;
//        }

        for ( Article article : finalList) {
            System.out.println(article);
        }

    }

}
