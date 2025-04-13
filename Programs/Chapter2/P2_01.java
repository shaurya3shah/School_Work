package Chapter2;

/*
Write a program that displays the dimensions of a letter-size
(8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters
per inch. Use constants and comments in your program.
*/

import java.util.Scanner;

public class P2_01 {
    public static void main(String[] args) {
        double width=8.5;
        double height=11;
        final double millimeters=25.4;
        //Dimentions of the paper & milimeters
        System.out.println(millimeters*height+"mm by "+millimeters*width+"mm");

    }
}
