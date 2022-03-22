package com.company.BasicSyntax.CS.Loops.MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double moneyLeft = balance;
        double moneySpent = 0;
        String boughtGame = "";
        boolean outOfMoney = false;
        boolean tooExpensive = false;

        while (!input.equals("Game Time")) {
            boughtGame = input;

            switch (boughtGame) {
                case "OutFall 4":
                    if (moneyLeft >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        moneySpent += 39.99;
                        moneyLeft -= 39.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                case "CS: OG":
                    if (moneyLeft >= 15.99) {
                        System.out.println("Bought CS: OG");
                        moneySpent += 15.99;
                        moneyLeft -= 15.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                case "Zplinter Zell":
                    if (moneyLeft >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        moneySpent += 19.99;
                        moneyLeft -= 19.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                case "Honored 2":
                    if (moneyLeft >= 59.99) {
                        System.out.println("Bought Honored 2");
                        moneySpent += 59.99;
                        moneyLeft -= 59.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                case "RoverWatch":
                    if (moneyLeft >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        moneySpent += 29.99;
                        moneyLeft -= 29.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (moneyLeft >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        moneySpent += 39.99;
                        moneyLeft -= 39.99;
                    } else {
                        tooExpensive = true;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (moneySpent > balance) {
                tooExpensive = true;
            }
            if (moneySpent >= balance) {
                outOfMoney = true;
            }

            if (outOfMoney) {
                System.out.println("Out of money!");
                break;
            }
            if (tooExpensive) {
                System.out.println("Too Expensive");
            }
            input = scanner.nextLine();
            if (input.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, moneyLeft);
            }
        }
    }
}
