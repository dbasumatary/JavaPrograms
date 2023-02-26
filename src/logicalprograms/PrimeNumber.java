package logicalprograms;

import java.util.Scanner;
/*Program to check if the number is prime or not*/
public class PrimeNumber{
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number to check: ");
        int input = scanner.nextInt();
        for (int i = 2; i <= input/2; i++) {     //We are looping from 2 to num/2 because a number is not divisible by more than its half
            if (input % i == 0) {                // Testing for even numbers
                flag = true;
                break;
            }
        }
        if (!flag) {                            //Checking if the flag is true or false
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");
        }
    }
}

