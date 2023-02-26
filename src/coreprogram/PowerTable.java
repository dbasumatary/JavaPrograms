package coreprogram;

import java.util.Scanner;
/*Program to find the table of powers of 2*/
public class PowerTable {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the value of n: ");
        Scanner scanner = new Scanner(System.in);                         //Input the value
        number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            if(number < 31){                                               //Cannot exceed 31 for int range
                System.out.println("Power of 2: 2^" + (i) +  " = " + Math.pow(2,i));
            }
            else{
                System.out.println("The value of n should be less than 31");
                number = scanner.nextInt();                                      //Ask again to input less than 31
            }
        }
    }
}
