package com.company.DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int openBracket = 0;
        int closeBracket = 0;
        boolean moreCloseBrackets = false;
        boolean moreOpenBrackets = false;

        for (int i = 0; i < n; i++) {
            String currentBracket = scanner.nextLine();
            if (currentBracket.equals("(")) {
                openBracket ++;
            }
            if (currentBracket.equals(")")) {
                closeBracket ++;
            }
            if (closeBracket > openBracket) {
                moreCloseBrackets = true;
                break;
            }
        }
        if (openBracket > closeBracket) {
            moreOpenBrackets = true;
        }
        if (moreCloseBrackets || moreOpenBrackets) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
