package coreprogram;

import java.util.Scanner;
/*Program to flip coin and print percentage of head and tail*/
public class CoinPercentage {
    public static void main(String[] args) {
        System.out.print("Enter positive integer: ");               //No. of timed to flip the coin
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        double heads = 0;
        double tails = 0;
        double headsPercent;
        double tailsPercent;
        for(int i = 0; i <= number; i++){
            double coin = Math.random();
            if (coin < 0.5){                                          //Checking for coin using random
                heads+=1;
            }
            else{
                tails+=1;
            }
        }
        headsPercent = (heads * 100)/number;
        System.out.println("Percentage of heads is : " + headsPercent);
        tailsPercent = 100 - headsPercent;
        System.out.println("Percentage of tails is : " + tailsPercent);
    }
}
