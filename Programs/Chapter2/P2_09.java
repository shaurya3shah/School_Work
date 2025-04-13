package Chapter2;

/*
Improve the program discussed in How To 2.1 to allow input of quarters in addition
to bills.
*/

import java.util.Scanner;

public class P2_09 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Money Please - ");
        double L1=in.nextDouble();
        System.out.print("Spending Please - ");
        double L2=in.nextDouble();
        double L3=L1-L2;
        double L4=(L3-Math.floor(L3))*100;
        //The Remaning money after dollars removed
        double L5=(L4-(L4%25))/25;
        double L6=L4%25;
        System.out.println("Dollars "+ Math.floor(L3));
        System.out.println("Quarters "+ L5);
        System.out.printf("Pennies %.2f", L6);
    }
}
