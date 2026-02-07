package inheritance;

import java.util.Arrays;
import java.util.Scanner;
// The main entry point for the JVM
public class OverloadMain {
    // The main entry point for the JVM
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is the original main method.");
        // Calling the overloaded main methods


        main("Hello Overloading!");
        main(100);
        //thiyafi
        System.out.println("Number of arguments: " + args.length);
        System.out.println(Arrays.toString(args));

    }

    // Overloaded main method with a String parameter
    public static void main(String arg1) {
        System.out.println("Overloaded main method with a String argument: " + arg1);
    }

    // Overloaded main method with an int parameter
    public static void main(int arg1) {
        System.out.println("Overloaded main method with an int argument: " + arg1);
    }
}
