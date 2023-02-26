package coreprogram;

import java.util.Scanner;
/*Program to swap two numbers and display*/
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Before Swap ------");
        System.out.print("First number: ");                               //Taking input of first number
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");                              //Taking input of second number
        int num2 = scanner.nextInt();
        int temp = num1;                                                  //Condition for swapping numbers
        num1 = num2;
        num2 = temp;
        System.out.println("----- After Swap ------");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
