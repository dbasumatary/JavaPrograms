package coreprogram;

import java.util.Scanner;
/*Program to find if the number is even or odd*/
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){                                     //Check if the number is divisible by 2 completely
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
