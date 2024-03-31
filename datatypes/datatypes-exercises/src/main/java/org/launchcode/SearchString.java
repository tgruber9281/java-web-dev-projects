package org.launchcode;
import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordToSearch;
        String aliceSent = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures " +
                "or conversation?’";

        System.out.println("Please enter a word to search:");
        wordToSearch = input.next();
        input.close();
        int indexOfSearch = aliceSent.toLowerCase().indexOf(wordToSearch.toLowerCase());
        System.out.println(wordToSearch + " was found: " + aliceSent.toLowerCase().contains(wordToSearch.toLowerCase()));
        System.out.println(wordToSearch + " was found at index: " + indexOfSearch +
                ". The length of the search word is: " + wordToSearch.length());
        String newSent = aliceSent.substring(0,indexOfSearch) + aliceSent.substring((indexOfSearch+wordToSearch.length()));
        System.out.println("New string is: " + newSent);
    }
}
