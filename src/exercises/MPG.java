package exercises;

import java.util.Scanner;

public class MPG {
    public static void main (String[] args){
        double miles,gallons,mpg;

        Scanner in = new Scanner(System.in);
        System.out.print("How many miles were driven?: ");
        miles=in.nextDouble();
        System.out.print("How many gallons were used?: ");
        gallons=in.nextDouble();

        mpg = miles / gallons;

        System.out.println("Your MPG rate for this trip is " + mpg);
    }
}
