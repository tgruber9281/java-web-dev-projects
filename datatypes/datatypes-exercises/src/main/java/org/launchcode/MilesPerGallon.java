package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milesDriven;
        double gallonsConsumed;
        double milesPerHour;

        System.out.println("How many miles were driven:");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons of fuel were consumed:");
        gallonsConsumed = input.nextDouble();
        input.close();
        milesPerHour = milesDriven/gallonsConsumed;
        System.out.println("Your miles per hour was: " + milesPerHour);
    }
}
