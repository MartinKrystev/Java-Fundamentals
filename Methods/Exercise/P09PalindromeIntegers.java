package com.company.Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int num = Math.abs(Integer.parseInt(input));


            System.out.println(palindrome(num));

            input = scanner.nextLine();
        }
    }

    public static boolean palindrome(int num) {

        String temp = Integer.toString(num);

        int[] arr = new int[temp.length()]; // creating and filling the int[]
        for (int i = 0; i < temp.length(); i++) {
            arr[i] =  temp.charAt(i) - '0';
        }

        // {1} {2} {3} {4} {5}
        boolean isPalindrome = false;
        for (int i = 0; i < arr.length / 2; i++) { // check for the Palindrome
            if (arr[i] == arr[arr.length - i - 1]) {
                isPalindrome = true;
            }
            return isPalindrome;
        }
        return isPalindrome;
    }

}
