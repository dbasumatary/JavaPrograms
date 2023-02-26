package coreprogram;

import java.util.Scanner;
/*Program to print the nth harmonic number*/
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");                    //Value of n for harmonic oscillator
        double number = scanner.nextDouble();
        double sum = 0.0;
        System.out.print("The Harmonic series is : ");
        for (double i = 1; i <= number; i++){
            sum = sum + 1/i;                                        //The harmonic no. is stored in sum
            System.out.print(sum + "  ");
        }
    }
}
