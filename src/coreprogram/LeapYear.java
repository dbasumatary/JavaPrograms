package coreprogram;

import java.util.Scanner;
/*Program to check if the year is leap year or not*/
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter a year : ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        while(year < 999 || year > 9999){                                        //Year must be 4-digit number
            System.out.println("Please enter year in 4 digit numbers");
            year = scanner.nextInt();                                             //Ask again to enter 4-digit nuber
        }
        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))          //Condition for leap year
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
