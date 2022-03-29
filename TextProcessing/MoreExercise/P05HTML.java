package com.company.TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.printf("<h1>%n    %s%n</h1>%n<article>%n    %s%n</article>%n", title, content);

        String input = scanner.nextLine();
        while (!input.equals("end of comments")) {
            System.out.printf("<div>%n    %s%n</div>%n", input);
            input = scanner.nextLine();
        }
    }
}
