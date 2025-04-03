/*
 Write a program that prompts the user for two integers and then prints
 •    The sum
 •    The difference
 •    The product
 •    The average
 •    The distance (absolute value of the difference)
 •    The maximum (the larger of the two)
 •    The minimum (the smaller of the two)
 Hint: The max and min functions are declared in the Math class.
*/

import java.util.Scanner;

public class P2_04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Number Please or Else...");
        int num1=in.nextInt();
        System.out.println("Number Please or Else...");
        int num2=in.nextInt();
        System.out.println("The sum is "+(num1+num2));
        System.out.println("The Difference is " + (num1-num2));
        System.out.println("The product is "+num1*num2 );
        System.out.println("The average is "+ (num1+num2)/2.0);
        System.out.println("The distance is "+ Math.abs(num1-num2));
        System.out.println("The Minimum is "+ Math.min(num1,num2));
        System.out.println("The Maximum is "+ Math.max(num1,num2));


    }
}