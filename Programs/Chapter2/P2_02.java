package Chapter2;

/*
 Write a program that computes and displays
 the perimeter of a letter-size (8.5 × 11 inches)
 sheet of paper and the length of its diagonal.
*/


public class P2_02 {
    public static void main(String[] args) {
        double width=8.5;
        double height=11;
        System.out.println("The result");
        System.out.println("The perimeter is "+(height+width)*2+" inches");
        System.out.println("The diagonal is "+(Math.sqrt(height*height+width*width))+" inches");
    }
}
