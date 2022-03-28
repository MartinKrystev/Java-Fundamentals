<<<<<<< HEAD
package com.company.Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<Character> charList = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charList.add(ch);
        }
        List<Integer> numberList = new ArrayList<>();
        List<String> textList = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        //T2exs15ti23ng1_3cT1h3e0_Roppe
        for (int i = 0; i < charList.size(); i++) { // ...splits the input into 2 Lists
            if (charList.get(i) >= 48 && charList.get(i) <= 57) {
                numberList.add(Integer.parseInt(String.valueOf(charList.get(i))));
            } else {
                textList.add(String.valueOf(charList.get(i)));
            }
        }
        //2 1 5 2 3 1 3 1 3 0 --> numberList   Texsting_cThe_Roppe --> textList
        for (int i = 0; i < numberList.size(); i++) { // ...fills the takeList and skipList
            if (i % 2 == 0) {
                takeList.add(numberList.get(i)); // 2 5 3 3 3 --> takeList
            } else {
                skipList.add(numberList.get(i)); // 1 2 1 1 0 --> skipList
            }
        }
        //Texsting_cThe_Roppe --> textList
        for (int i = 0; i < takeList.size(); i++) { // ... goes thru takeList and skipList

            int takeIterations = Math.min(takeList.get(i), textList.size());
            int takeCounter = 0;
            for (int j = 0; j < takeIterations; j++) { // ... goes thru each element of the takeList
                if (takeCounter < takeList.get(i)) {
                    if (!textList.isEmpty()){
                    resultList.add(textList.get(0));
                    textList.remove(0);
                    }
                    takeCounter++;
                } else {
                    break;
                }
                j = -1;
            }

            int skipIterations = Math.min(skipList.get(0), textList.size());
            int skipCounter = 0;
            for (int k = 0; k < skipIterations; k++) {
                if (skipCounter < skipList.get(k)) {
                    textList.remove(textList.get(0));
                    skipCounter++;
                } else {
                    break;
                }
                k = -1;
            }
            skipList.remove(0);
        }
        for (String el : resultList) {
            System.out.print(el);
        }
    }
}
=======
package com.company.Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<Character> charList = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charList.add(ch);
        }
        List<Integer> numberList = new ArrayList<>();
        List<String> textList = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        //T2exs15ti23ng1_3cT1h3e0_Roppe
        for (int i = 0; i < charList.size(); i++) { // ...splits the input into 2 Lists
            if (charList.get(i) >= 48 && charList.get(i) <= 57) {
                numberList.add(Integer.parseInt(String.valueOf(charList.get(i))));
            } else {
                textList.add(String.valueOf(charList.get(i)));
            }
        }
        //2 1 5 2 3 1 3 1 3 0 --> numberList   Texsting_cThe_Roppe --> textList
        for (int i = 0; i < numberList.size(); i++) { // ...fills the takeList and skipList
            if (i % 2 == 0) {
                takeList.add(numberList.get(i)); // 2 5 3 3 3 --> takeList
            } else {
                skipList.add(numberList.get(i)); // 1 2 1 1 0 --> skipList
            }
        }
        //Texsting_cThe_Roppe --> textList
        for (int i = 0; i < takeList.size(); i++) { // ... goes thru takeList and skipList

            int takeIterations = Math.min(takeList.get(i), textList.size());
            int takeCounter = 0;
            for (int j = 0; j < takeIterations; j++) { // ... goes thru each element of the takeList
                if (takeCounter < takeList.get(i)) {
                    if (!textList.isEmpty()){
                    resultList.add(textList.get(0));
                    textList.remove(0);
                    }
                    takeCounter++;
                } else {
                    break;
                }
                j = -1;
            }

            int skipIterations = Math.min(skipList.get(0), textList.size());
            int skipCounter = 0;
            for (int k = 0; k < skipIterations; k++) {
                if (skipCounter < skipList.get(k)) {
                    textList.remove(textList.get(0));
                    skipCounter++;
                } else {
                    break;
                }
                k = -1;
            }
            skipList.remove(0);
        }
        for (String el : resultList) {
            System.out.print(el);
        }
    }
}
>>>>>>> 75cc6e853cd15884d3397160efc86e2986dd4f7d
