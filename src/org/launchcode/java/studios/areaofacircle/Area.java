package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = userInput.nextDouble();

        System.out.println("The area of a circle of radius " + radius + " is: " + Math.PI * radius * radius);
    }

}
