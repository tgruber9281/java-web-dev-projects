package org.launchcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNums = new ArrayList<>();
        arrayOfNums.add(2);
        arrayOfNums.add(5);
        arrayOfNums.add(7);
        arrayOfNums.add(8);
        arrayOfNums.add(10);
        arrayOfNums.add(6);
        arrayOfNums.add(9);
        arrayOfNums.add(11);
        arrayOfNums.add(31);
        arrayOfNums.add(45);
        arrayOfNums.add(70);
        arrayOfNums.add(80);

        System.out.println(sumEvenNums(arrayOfNums));

        String sentence = "I would not could not in a box I would not could not with a fox I will not eat them " +
                "in a house I will not eat them with a mouse";
        ArrayList<String> sentList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        getWordWithLength(sentList);
    }
    private static int sumEvenNums(ArrayList<Integer> numsArray) {
        int sumOfEvens = 0;
        for (int num : numsArray) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            }
        }
        return sumOfEvens;
    }

    private static void getWordWithLength(ArrayList<String> stringArray){
        Scanner input = new Scanner(System.in);
        System.out.print("What length of word would you like to search for? ");
        int wordLength = input.nextInt();
        input.close();
        for (String word : stringArray){
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
