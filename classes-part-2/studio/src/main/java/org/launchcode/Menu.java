package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private ArrayList<ArrayList<MenuItem>> fullMenu = new ArrayList<>();
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
    private ArrayList<MenuItem> desserts = new ArrayList<>();
    private String dateUpdated;
    
    public Menu () {
    }
    
    public void addItem (MenuItem item) {
        if (Objects.equals(item.getCat(), "Appetizer")) {
            appetizers.add(item);
        } else if (Objects.equals(item.getCat(), "Main Course")) {
            mainCourses.add(item);
        } else if (Objects.equals(item.getCat(), "Dessert")) {
            desserts.add(item);
        }
    }
    public void assembleMenu(){
        fullMenu.add(appetizers);
        fullMenu.add(mainCourses);
        fullMenu.add(desserts);
    }
    
    public void printMenu(){
        for (ArrayList<MenuItem> section : fullMenu){
            for (MenuItem item : section){
                System.out.println(item);
            }
        }
    }
    public void printMenuItem(String query){
        for (ArrayList<MenuItem> section : fullMenu){
            for (MenuItem item : section){
                if (item.getName().equals(query)){
                    System.out.println(item);
                }
            }
        }
    }
    public void printMenuSection(String section){
           if (section )
    }
}
