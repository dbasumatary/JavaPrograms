package coreprogram;

import java.util.Scanner;
/*Program to compute the prime factorization*/
public class PrimeFactors {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();                                         //Input the number
        if(number == 2 || number == 1){
            System.out.println("Enter numbers greater than 2");
            number = scanner.nextInt();
        }
        System.out.println("The prime factors of " + number + " are : ");
        for(int i = 2; i <= number; i++){
            while(number%i == 0) {
                System.out.println(i);
                number /= i;                                                 //Increment for next loop
            }
        }
    }
}
