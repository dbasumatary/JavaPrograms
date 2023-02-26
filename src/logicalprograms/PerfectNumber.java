package logicalprograms;

import java.util.Scanner;
/*Program to check if the number entered is perfect or not*/
public class PerfectNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number to check if it is a perfect number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++){
            if(number%i == 0){               //Checking the perfectly divisible numbers
                sum += i;                    //Adding these numbers in sum
            }
        }
        if (sum == number){
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
