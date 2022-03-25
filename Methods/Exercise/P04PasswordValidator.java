package com.company.Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPass = scanner.nextLine();

        if (stringLength(inputPass) == false) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (stringLettersAndDigits(inputPass) == false) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (stringMinDigits(inputPass) == false) {
            System.out.println("Password must have at least 2 digits");
        }
        if (stringLength(inputPass) && stringLettersAndDigits(inputPass) && stringMinDigits(inputPass)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean stringLength(String inputPass) {
        boolean hasGoodLength = true;
        if (inputPass.length() < 6 || inputPass.length() > 10) {
            hasGoodLength = false;
        }
        return hasGoodLength;
    }

    private static boolean stringLettersAndDigits(String inputPass) {
        boolean hasLettersAndDigits = false;
        char[] checkArr = inputPass.toCharArray();

        for (int i = 0; i < checkArr.length; i++) {
            if (checkArr[i] >= 48 && checkArr[i] <= 57 || checkArr[i] >= 65 && checkArr[i] <= 90 || checkArr[i] >= 97 && checkArr[i] <= 122) {
                hasLettersAndDigits = true;
            } else {
                return false;
            }
        }
        return hasLettersAndDigits;
    }

    private static boolean stringMinDigits(String inputPass) {
        boolean hasMinDigits = true;
        char[] checkArr = inputPass.toCharArray();

        int digitCounter = 0;
        for (int i = 0; i < inputPass.length(); i++) {
            if (checkArr[i] >= 48 && checkArr[i] <= 57) {
                digitCounter++;
            }
        }
        if (digitCounter < 2) {
            hasMinDigits = false;
        }
        return hasMinDigits;
    }

}
