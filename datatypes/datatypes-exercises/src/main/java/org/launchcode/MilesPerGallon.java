package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer miles = input.nextInt();

        System.out.println("How much gas have you used (in gallons)?");
        Integer gallons = input.nextInt();

        Integer milesPerGallon = miles / gallons;
        System.out.println("Your miles-per-gallon is " + milesPerGallon);
    }
}
