package Chapter2;

/*
Write a program that asks the user for the lengths
of the sides of a rectangle. Then print
•    The area and perimeter of the rectangle
•    The length of the diagonal (use the Pythagorean theorem)
*/

import java.util.Scanner;

public class P2_08 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Length Please - ");
        double Length1=in.nextDouble();
        System.out.print("Length Please - ");
        double Length2=in.nextDouble();
        System.out.println("The area is: "+ Length1*Length2+" and the peremeter is: "+ ((Length1*2)+(Length2*2)));
        System.out.println("The diagonal is: "+ Math.sqrt((Length1*Length1+Length2*Length2)));
    }
}
