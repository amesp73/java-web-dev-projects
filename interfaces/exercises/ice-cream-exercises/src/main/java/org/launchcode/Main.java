package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Comparator<Flavor> compareFlavor = new FlavorComparator();
        Comparator<Cone> compareCone = new ConeComparator();

        System.out.println(flavors + "\n*****************\n");
        flavors.sort(compareFlavor);
        System.out.println(flavors + "\n*****************\n");

        /* OR could use
        flavors.sort(new FlavorComparator());

        this combines the declaring and initializing of comparator object
         */

        System.out.println(cones + "\n*****************\n");
        cones.sort(compareCone);
        System.out.println(cones + "\n*****************\n");
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}