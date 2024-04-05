package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        File stringFile = new File("C:\\Users\\grube\\IdeaProjects\\java-web-dev-projects\\control-flow-and-collections\\studio\\counting-characters\\src\\main\\java\\org\\launchcode\\string.txt");
        String sentString;
        Scanner input = new Scanner(stringFile);
        System.out.println("Enter a sentence and I will count the characters: ");
        sentString = input.nextLine();
        input.close();
        char[] charactersInString = sentString.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();

        for (char character : charactersInString) {
            if (!characterCounts.containsKey(character)) {
                characterCounts.put(character, 1);
            } else {
                characterCounts.put(character, characterCounts.get(character)+1);
            }
        }

        for (Map.Entry<Character, Integer> character : characterCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
