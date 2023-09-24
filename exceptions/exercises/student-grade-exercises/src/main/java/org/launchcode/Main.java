package org.launchcode;


import java.util.HashMap;



public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Divide(6, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");


        // Test out your CheckFileExtension() function!
        int studentPoints = 0;

        try {
            studentPoints = CheckFileExtension(studentFiles.get("Brad"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            studentPoints -= 1;
        }
        System.out.println(studentPoints);
//        System.out.println(CheckFileExtension(""));
    }

    public static void Divide(int x, int y) {

        try {
            System.out.println(x / y);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static int CheckFileExtension(String fileName) {

        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Student did not submit a file!");
        }

        if(fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }

    }
}