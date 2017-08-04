package org.launchcode.java.demos.studios;
import java.util.Scanner;

public class Area {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("The area is: " + area);
    }
}