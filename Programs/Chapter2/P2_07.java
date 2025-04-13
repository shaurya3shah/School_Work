package Chapter2;

/*
Write a program that prompts the user for a radius and then prints
•    The area and circumference of a circle with that radius
•    The volume and surface area of a sphere with that radius
*/

import java.util.Scanner;

public class P2_07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Radius Please - ");
        double Radius=in.nextDouble();

        System.out.println("Area="+ Math.PI*Radius*Radius);
        System.out.println("Curcumference="+ Math.PI*Radius*2);
        System.out.println("Volume="+Radius*Math.PI*Radius*(4/3)*Radius);
        System.out.println("Surface Area of a sphere="+ Math.PI*Radius*Radius*4);
    }
}
