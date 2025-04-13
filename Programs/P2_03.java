/*
Write a program that reads a number and displays
the square, cube, and fourth power. Use the Math.pow method
only for the fourth power. 
*/

import java.util.Scanner;

public class P2_03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Hi if you could please supply me with a number that would be useful for my war efforts.");
        int war_efforts=in.nextInt();
        System.out.println("Square = "+war_efforts*war_efforts+"  Cube = "+war_efforts*war_efforts*war_efforts+"  Fourth power = "+Math.pow(war_efforts,4));

    }
}