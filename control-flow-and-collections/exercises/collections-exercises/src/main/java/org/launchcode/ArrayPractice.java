package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numsArray = {1, 1, 2, 3, 5, 8};

        for (int num : numsArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";

        String[] sentArray = sentence.split("\\. ");
        System.out.println(Arrays.toString(sentArray));
    }
}
