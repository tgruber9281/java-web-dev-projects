package org.launchcode;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        divide(3,4);
        divide(4,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.jaa");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        
        for (Map.Entry<String, String> file : studentFiles.entrySet()) {
            System.out.println(file.getKey() + "'s score is " + checkFileExtension(file.getValue()));
        }
        
    }

    public static void divide(double x, double y)
    {
        if (y == 0) {
            try {
                throw new DivideByZeroException("You cannot divide by zero, try again.");
            } catch (DivideByZeroException e) {
                e.printStackTrace();
            }
        } else {
            double result = x/y;
            System.out.println("x: " + x + " divided by y: " + y + " equals: " + result);
        }
    }

    public static int checkFileExtension(String fileName) {
        int score;
        String lastFive = org.apache.commons.lang3.StringUtils.right( fileName, 5 );
        if (lastFive.equals(".java")){
            score = 1;
        } else if (fileName.isEmpty()) {
            try {
                throw new NullFileException("Null file.");
            } catch (NullFileException e) {
                e.printStackTrace();
            }
            score = -1;
        } else score = 0;
        return score;
    }
}