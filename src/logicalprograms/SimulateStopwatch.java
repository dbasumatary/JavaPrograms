package logicalprograms;

import java.util.Scanner;
/*Program to measure time elapsed in a stopwatch*/
public class SimulateStopwatch {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number between 0-9 to start: ");        //Press any number to start
        int key = scanner.nextInt();
        double start = System.currentTimeMillis();                          //Starting the time
        System.out.println("The starting time is " + start);
        System.out.println();
        System.out.print("Enter any number between 0-9 to stop: ");         //Press any number to stop
        key = scanner.nextInt();
        double stop = System.currentTimeMillis();                           //Stopping the time
        System.out.println("The stopping time is " + stop);
        double timeElapse = (stop - start)/1000;                  //The time elapsed will depend on how long we wait to stop the time
        System.out.println();
        System.out.println("The elapsed Time is "+ timeElapse +" seconds");
    }
}
