package com.company.AssociativeArrays.MoreExercise;

import java.util.*;

public class P05DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<Integer>>> pool = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

            String type = data[0];
            String name = data[1];
            String missing = "null";

            int damage = 0;
            int health = 0;
            int armor = 0;

            if (data[2].equals(missing)) {
                damage = 45;
            } else {
                damage = Integer.parseInt(data[2]);
            }
            if (data[3].equals(missing)) {
                health = 250;
            } else {
                health = Integer.parseInt(data[3]);
            }
            if (data[4].equals(missing)) {
                armor = 10;
            } else {
                armor = Integer.parseInt(data[4]);
            }

            if (!pool.containsKey(type)) {
                pool.put(type, new LinkedHashMap<>());
                if (!pool.get(type).containsKey(name)) {
                    pool.get(type).put(name, new ArrayList<>());
                    pool.get(type).get(name).add(damage);
                    pool.get(type).get(name).add(health);
                    pool.get(type).get(name).add(armor);
                } else {
                    pool.get(type).get(name).set(0, damage);
                    pool.get(type).get(name).set(1, health);
                    pool.get(type).get(name).set(2, armor);
                }
            } else {
                pool.get(type).put(name, new ArrayList<>());
                pool.get(type).get(name).add(damage);
                pool.get(type).get(name).add(health);
                pool.get(type).get(name).add(armor);
            }
        }

        for (Map.Entry<String, Map<String, List<Integer>>> entry : pool.entrySet()) {
            double damage = 0.0;
            double health = 0.0;
            double armor = 0.0;
            int nameSize = entry.getValue().size();
            for (Map.Entry<String, List<Integer>> nameEntry : entry.getValue().entrySet()) {
                damage += nameEntry.getValue().get(0);
                health += nameEntry.getValue().get(1);
                armor += nameEntry.getValue().get(2);
            }
            double avgDamage = damage / nameSize;
            double avgHealth = health / nameSize;
            double avgArmor = armor / nameSize;
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), avgDamage, avgHealth, avgArmor);

            entry.getValue().entrySet().stream()
                    .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                    .forEach(dragon -> {
                        System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n"
                                , dragon.getKey(), dragon.getValue().get(0), dragon.getValue().get(1), dragon.getValue().get(2));
                    });
        }

    }
}
