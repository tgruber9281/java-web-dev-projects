package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem ravioli = new MenuItem("Ravioli",5.5,"Fried meat ravioli with meat sauce", "Appetizer",true);
        MenuItem cheesyBread = new MenuItem("Cheesy Bread", 3.0, "French bread slices with Provel" +
                " Cheese toasted on top", "Appetizer", false);
        MenuItem lasagna = new MenuItem("Lasagna", 20.0, "Classic lasagna with cottage cheese and" +
                " sausage", "Main Course", false);
        MenuItem pizza = new MenuItem("Pizza", 15.0, "Pepperoni Pizza with provel cheese", "Main " +
                "Course", true);
        MenuItem lemonCake = new MenuItem("Lemon Cake", 8.0, "Tart lemon cake with cream cheese " +
                "frosting", "Dessert", true);
        MenuItem cannoli = new MenuItem("Cannoli", 4.55, "Classic cannoli with chocolate chip " +
                "filling", "Dessert", false);
        menu.addItem(ravioli);
        menu.addItem(cheesyBread);
        menu.addItem(lasagna);
        menu.addItem(pizza);
        menu.addItem(lemonCake);
        menu.addItem(cannoli);
        menu.assembleMenu();
        Scanner input = new Scanner(System.in);
        String query;
        menu.printMenuItem(query);
        while (true) {
            System.out.println("What would you like to see? \n Type 1 for full menu. \n Type 2 to" +
                    " display appetizers. \n Type 3 for main courses. \n Type 4 for desserts. \n " +
                    "Type 5 to search for an item.");
            query = input.next();
            input.close();
            switch (query) {
                case "1": menu.printMenu();
                break;
                case "2":
            }
        }
    }
}
