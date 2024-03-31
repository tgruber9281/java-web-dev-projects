package org.launchcode;
import java.util.Scanner;
public class CalcRectArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        int length;
        System.out.println("Please enter width of rectangle:");
        width = input.nextInt();
        System.out.println("Please enter length of rectangle:");
        length = input.nextInt();
        input.close();
        int area = width * length;
        System.out.println("The area of your rectangle is: " + area);
    }
}
