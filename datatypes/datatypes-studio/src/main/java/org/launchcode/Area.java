package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;

        System.out.print("Enter the radius of a circle: ");
        radius = input.nextDouble();

        while (radius < 0) {
            System.out.print("Enter the radius of a circle: ");
            radius = input.nextDouble();
        }
        input.close();
        System.out.print("The area of a circle with a radius of " + radius + " is: " + Circle.getArea(radius));
    }
}
