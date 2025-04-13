package Chapter2;

/*
Write a program that reads in an integer and breaks it into a sequence of individual
digits. For example, the input 16384 is displayed as
1 6 3 8 4
You may assume that the input has no more than five digits and is not negative.
 */

import java.util.Scanner;

public class P2_16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Number Please - ");
        int num1=in.nextInt();
        int num2=(num1%10);
        int num3=((num1%100)-num2)/10;
        int num4=((num1%1000)-(num3*10+num2))/100;
        int num5=((num1%10000)-(num3*100+num3*10+num2))/1000;

        //System.out.println(num5+" "+num4+" "+num3+" "+num2+" ");
        System.out.println(num2+" "+num3+" "+num4+" "+num5);
    }
}
