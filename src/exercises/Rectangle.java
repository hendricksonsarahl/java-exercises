package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        double length,width,area;

        Scanner in = new Scanner(System.in);
        //Read Length and Width of Rectangle
        System.out.print("Enter length: ");
        length=in.nextDouble();
        System.out.println("Enter the width:");
        width=in.nextDouble();

        //Calculate area using inputs
        area = length*width;
        //Print the result
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is: " + area);

    }

}
