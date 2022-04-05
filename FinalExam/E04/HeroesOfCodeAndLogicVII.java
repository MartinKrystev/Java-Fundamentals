package com.company.FinalExam.E04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Heroes> heroesList = new ArrayList<>();

        for (int i = 0; i < n; i++) { //"{hero name} {HP} {MP}"    -  max: HP-100  MP-200
            String[] input = scanner.nextLine().split(" ");
            String heroName = input[0];
            int heroHealth = Integer.parseInt(input[1]);
            if (heroHealth > 100) {
                heroHealth = 100;
            }
            int heroMana = Integer.parseInt(input[2]);
            if (heroMana > 200) {
                heroMana = 200;
            }

            Heroes currHero = new Heroes(heroName, heroHealth, heroMana);
            heroesList.add(currHero);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "CastSpell": //CastSpell – {hero name} – {MP needed} – {spell name}"
                    for (int i = 0; i < heroesList.size(); i++) {
                        if (heroesList.get(i).getName().equals(command[1])) {
                            int mpNeeded = Integer.parseInt(command[2]);
                            if (heroesList.get(i).getMana() >= mpNeeded) {
                                int manaLeft = heroesList.get(i).getMana() - mpNeeded;
                                System.out.printf("%s has successfully cast %s and now has %d MP!%n"
                                        , heroesList.get(i).getName(), command[3], manaLeft);
                                heroesList.get(i).setMana(manaLeft);
                            } else {
                                System.out.printf("%s does not have enough MP to cast %s!%n"
                                        , heroesList.get(i).getName(), command[3]);
                            }
                        }
                    }
                    break;
                case "TakeDamage": //TakeDamage – {hero name} – {damage} – {attacker}"
                    for (int i = 0; i < heroesList.size(); i++) {
                        if (heroesList.get(i).getName().equals(command[1])) {
                            int healthLeft = heroesList.get(i).getHealth() - Integer.parseInt(command[2]);
                            if (healthLeft > 0) {
                                System.out.printf("%s was hit for %s HP by %s and now has %d HP left!%n"
                                        , heroesList.get(i).getName(), command[2], command[3], healthLeft);
                                heroesList.get(i).setHealth(healthLeft);
                            } else {
                                System.out.printf("%s has been killed by %s!%n"
                                        , heroesList.get(i).getName(), command[3]);
                                heroesList.remove(i);
                                break;
                            }
                        }
                    }
                    break;
                case "Recharge": //Recharge – {hero name} – {amount}"
                    for (int i = 0; i < heroesList.size(); i++) {
                        if (heroesList.get(i).getName().equals(command[1])) {
                            int currMana = heroesList.get(i).getMana() + Integer.parseInt(command[2]);
                            if (currMana > 200) {
                                currMana = 200;
                            }
                            int recharged = currMana - heroesList.get(i).getMana();
                            System.out.printf("%s recharged for %d MP!%n"
                                    , heroesList.get(i).getName(), recharged);
                            heroesList.get(i).setMana(currMana);
                        }
                    }
                    break;
                case "Heal": //Heal – {hero name} – {amount}"
                    for (int i = 0; i < heroesList.size(); i++) {
                        if (heroesList.get(i).getName().equals(command[1])) {
                            int currHealth = heroesList.get(i).getHealth() + Integer.parseInt(command[2]);
                            if (currHealth > 100) {
                                currHealth = 100;
                            }
                            System.out.printf("%s healed for %d HP!%n"
                                    , heroesList.get(i).getName(), currHealth - heroesList.get(i).getHealth());
                            heroesList.get(i).setHealth(currHealth);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < heroesList.size(); i++) {
            System.out.println(heroesList.get(i).getName());
            System.out.printf("  HP: %d%n  MP: %d%n", heroesList.get(i).getHealth(), heroesList.get(i).getMana());
        }

    }

    static class Heroes {
        String name;
        int health;
        int mana;

        public Heroes(String name, int health, int mana) {
            this.name = name;
            this.health = health;
            this.mana = mana;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }
    }
}
