package exercises;
import java.util.Scanner;

// Beginning of class definition
public class Hello_World {

    // class declaration
    public static void main(String[] args) {
        // use Scanner to get user input, then respond using their input
        Scanner s = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = s.next();
        System.out.println("Hello " + name + "!");

    }
}
