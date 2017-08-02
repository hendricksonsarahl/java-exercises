package org.launchcode.java.studios;
import org.launchcode.java.demos.java4python.ElseIf;

import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = in.nextDouble();

        while (radius < 0) {
            System.out.println("Input positive num.");
            System.out.println("");
            System.out.println("Enter a radius:");
            radius = in.nextDouble();


        }


        double area = area(radius);
        System.out.println("The area of a circle of radius " + radius + " is :" + area);

    }

    public static Double area(double radius){
        return 3.14 * radius * radius;

    }

}
