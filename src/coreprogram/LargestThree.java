package coreprogram;

import java.util.Scanner;
/*Program to find the largest among three numbers*/
public class LargestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();
        if( first >= second && first >= third)                                         //First is larger than both
            System.out.println("The largest number among the three is " + first);
        else if (second >= first && second >= third)                                   //Second is larger than both
            System.out.println("The largest number among the three is " + second);
        else                                                                           //Third is the largest
            System.out.println("The largest number among the three is " + third);
    }
}
