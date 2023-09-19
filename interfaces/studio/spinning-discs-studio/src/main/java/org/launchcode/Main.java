package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD testCD = new CD("CD 1", 24.5, "album", 4500, 15);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        testCD.spinDisc();
        testCD.readDisc();
        testCD.writeDisc();
        testCD.reportData();


        DVD testDVD = new DVD("DVD 1", 75.7, "movie", 5000, 14.5);
        testDVD.spinDisc();
        testCD.readDisc();
        testDVD.writeDisc();
        testDVD.reportData();
    }
}