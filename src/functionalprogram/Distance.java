package functionalprogram;

import java.util.Scanner;
/*Program to print the distance between two points*/
public class Distance {
    static double distance(double x1, double y1, double x2, double y2){
        return (double) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));         // Formula for calculating distance
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x-coordinate of A: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter y-coordinate of A: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter x-coordinate of B: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter y-coordinate of B");
        double y2 = scanner.nextDouble();
        System.out.println("The distance between"+"("+x1+","+y1+") and "+"("+x2+","+y2+") is "+ distance(x1,y1,x2,y2));
    }
}
