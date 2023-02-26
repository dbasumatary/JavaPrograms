package logicalprograms;

import java.util.Scanner;
/*Program to find reverse of a number*/
public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int number = scanner.nextInt();
        System.out.println("The original number: " + number);
        while (number != 0) {
            int remainder = number % 10;            //Find the remainder to get the last digit
            reverse = reverse * 10 + remainder;     //This will keep storing the reverse value
            number /= 10;                           //This will remove the last digit
        }
        System.out.println("The reversed number: " + reverse);
    }
}
