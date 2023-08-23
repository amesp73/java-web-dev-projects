package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numValues = {1, 1, 2, 3, 5, 8};
//        for (Integer i : numValues) {
//            System.out.println(i);
//        }
        for (int i : numValues) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String quote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

//        String[] arrayOfWords = quote.split(" ");
//        System.out.println(Arrays.toString(arrayOfWords));

        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(11);
        numbers.add(45);
        numbers.add(21);
        numbers.add(4);
        numbers.add(90);
        numbers.add(71);
        numbers.add(96);
        numbers.add(37);
        System.out.println(numbers);
        int sum = getSum(numbers);
        System.out.println(sum);



        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the word length to search for: ");
//        int numLength = input.nextInt();

        ArrayList<String> words = new ArrayList<>();
        words.add("carts");
        words.add("tangle");
        words.add("clerk");
        words.add("clasp");
        words.add("jacket");
        words.add("indigo");
        System.out.println(words);
        fiveLetterWords(words);


        HashMap<Integer, String> classRoster = new HashMap<>();
        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        input.close();

        System.out.println("\nClass roster:");

//        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
//            System.out.println(student.getValue() + "'s ID: " + student.getKey());
//        }

        classRoster.forEach((k, v) -> System.out.println(v + "'s ID: " + k));

        System.out.println("Number of students in roster: " + classRoster.size());
    }

    public static int getSum(ArrayList<Integer> arr) {
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(ArrayList<String> arr) {
        for (String word : arr) {
            if (word.length() == 5) {
                System.out.println(word);;
            }
        }
    }
}

