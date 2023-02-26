package coreprogram;

import java.util.Scanner;
/*Program to compute quotient and remainder*/
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Dividend: ");                          //Input the value of dividend
        int dividend = scanner.nextInt();
        System.out.print("Enter the Divisor: ");                           //Input the value of divisor
        int divisor = scanner.nextInt();
        if(dividend < divisor){
            System.out.println("Dividend cannot be smaller than divisor");
        }
        else if (dividend >= divisor) {
            int quotient = dividend/divisor;                                     //Solving quotient
            int remainder = dividend%divisor;                                    //Solving remainder
            System.out.println("Quotient : " + quotient);
            System.out.println("Remainder : " + remainder);
        }
    }
}
