package com.company.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        //DecimalFormat df = new DecimalFormat("0.##");

        // System.out.println(df.format(calculate(firstNum, operator, secondNum)));
        // System.out.println(new DecimalFormat("0.###").format(calculate(firstNum, operator, secondNum)));

    }

    public static double calculate(int firstNum, char operator, int secondNum) {
        double sum = 0;
        switch (operator) {
            case '/':
                sum = firstNum / secondNum * 1.0;
                break;
            case '*':
                sum = firstNum * secondNum * 1.0;
                break;
            case '+':
                sum = firstNum + secondNum;
                break;
            case '-':
                sum = firstNum - secondNum;
                break;
        }
        return sum;
    }
}
