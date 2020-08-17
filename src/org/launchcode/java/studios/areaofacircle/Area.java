package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter a radius: ");
        do {
//            System.out.println("Enter a radius: ");
            while (!input.hasNextDouble()) {
                System.err.println("That's not a number! Enter a radius: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));

        }
    }
