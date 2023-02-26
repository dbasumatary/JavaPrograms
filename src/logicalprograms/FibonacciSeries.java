package logicalprograms;

import java.util.Scanner;
public class FibonacciSeries{
    //Program to print Fibonacci series
    public static void main(String []args)
    {
        int number1 = 0, number2 = 1, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which to see the Fibonacci series: ");
        int count = scanner.nextInt();
        System.out.print("The Fibonacci series is : " + number1 +" "+ number2);    //Printing 0 and 1
        for(int i = 2; i < count; i++)      //0 and 1 are already printed so loop will start from 2
        {
            sum = number1 + number2;
            System.out.print(" "+sum);
            number1 = number2;
            number2 = sum;
        }
    }
}
