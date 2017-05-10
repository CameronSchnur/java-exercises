package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by cameron on 5/8/17.
 */
public class Area {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double r = in.nextDouble();

        while(r < 0) {
            System.out.println("Please print a positive value.");
            r = in.nextDouble();
        }

        double a = Math.PI * r * r;

        System.out.println("The area of a circle with the radius " + r + " is: " + a);
    }
}
