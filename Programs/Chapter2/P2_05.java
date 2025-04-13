package Chapter2;

/*
Enhance output of Exercise P2.4 so that numbers are properly aligned:
Sum:             45
Difference:      -5
Product:        500
Average:         22.50
Distance:         5
Maximum:         25
Minimum:         20
*/

import java.util.Scanner;

public class P2_05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Number Please or Else - ");
        int num1=in.nextInt();
        System.out.print("Number Please or Else - ");
        int num2=in.nextInt();



        System.out.printf("sum:        %10d \n",(num1+num2));
        System.out.printf("Difference: %10d \n" , (num1-num2));
        System.out.printf("product:    %10d \n",num1*num2 );
        System.out.printf("average:       %10.2f \n", (num1+num2)/2.0);
        System.out.printf("distance:   %10d \n",Math.abs(num1-num2));
        System.out.printf("Minimum:    %10d\n", Math.min(num1,num2));
        System.out.printf("Maximum:    %10d\n", Math.max(num1,num2));
    }
}
