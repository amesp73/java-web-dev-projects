package org.launchcode;

import java.util.Scanner;
public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence =
                        "Alice was beginning to get very tired of " +
                        "sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice " +
                        "she had peeped into the book her sister was " +
                        "reading, but it had no pictures or " +
                        "conversations in it, ‘and what is the use of a book,’ " +
                        "thought Alice ‘without pictures or conversation?";
        System.out.println("Search for a term within the sentence:");
        String term = input.nextLine();
        firstSentence = firstSentence.toLowerCase();
        if (firstSentence.contains(term.toLowerCase())) {
            System.out.println("Term " + term + " was found!");
            System.out.println(firstSentence.indexOf(term));
            System.out.println(term.length());
            firstSentence = firstSentence.replace(term, "");
            firstSentence = firstSentence.replaceAll("\\s+", " ");
            System.out.println(firstSentence);
        } else {
            System.out.println("Term " + term + " was NOT found!");
        }

    }
}
