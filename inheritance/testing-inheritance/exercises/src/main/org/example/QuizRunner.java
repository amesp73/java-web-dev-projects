package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizRunner {

    String[] questions;

    public static void main(String[] args) {
//        int firstNumber = 1;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("First " + firstNumber);
//        int secondNum = firstNumber + 1;
//        System.out.println("First " + firstNumber);
//        System.out.println("Second " + secondNum);
//        input.next();

        System.out.println("Let's make a quiz!");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please select\n1. Make a test question\n0. End program");
            int choice = input.nextInt();
            HashMap<String, String> questions = new HashMap<>();
            String[]

            questions.put("What planet do we live on?", "Earth");
            questions.put("What primary color starts with R?", "Red");
            questions.put("What color is wood?", "Brown");

            System.out.println("My hashmap is :" + questions);


            if(choice == 1) {9
                for (Map.Entry<String, String> question : questions.entrySet()) {
                    System.out.println(question.getKey());
                }
            } else {
                break;
            }
        }

    }
}
