package Chapter2;

/*
Write a program that prompts the user for a measurement
in meters and then converts it to miles, feet, and inches.
*/

import java.util.Scanner;

public class P2_06 {
    public static void main(String[] args) {
        final double MILES_PER_METER = 0.000621371192;
        final double FEET_PER_METER = 3.2808399;
        final double INCHES_PER_METER = 39.3700787;
        Scanner in=new Scanner(System.in);
        System.out.print("Legnth Please - ");
        int Length=in.nextInt();

        System.out.println("In miles: "+MILES_PER_METER*Length);
        System.out.println("In inches: "+INCHES_PER_METER*Length);
        System.out.println("In feet: "+FEET_PER_METER*Length);
    }
}
