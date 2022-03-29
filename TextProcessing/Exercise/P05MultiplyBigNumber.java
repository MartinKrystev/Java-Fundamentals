package com.company.TextProcessing.Exercise;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        int reminder = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(text.charAt(i)));
            int product = digit * num + reminder;

            if (i == 0) {
                sb.insert(0, product);
            } else {
                int digitAdd = product % 10;
                reminder = product / 10;
                sb. insert(0, digitAdd);
            }
        }

        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);

    }
}
