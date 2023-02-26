package functionalprogram;

import java.util.Scanner;
/*Program to print the wind chill*/
public class WindChill {
    static double windChill(double temperature, double speed) {                //Using formula for windChill
        double wind = 35.74 + 0.62158 * temperature + (0.4275 * temperature - 35.75) * Math.pow(speed, 0.16);
        return wind;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter Wind Speed in miles per hour: ");
        double speed = input.nextDouble();
        /*The windChill formula is invalid if temperature is larger than 50 in absolute value or if speed is larger than 120 or less than 3*/
        if (Math.abs(temperature) > 50 || speed > 120 || speed < 3){
            System.out.println("Please enter the correct input");
        }
        else {
            System.out.println("The value of Wind Chill is : " + windChill(temperature,speed));
        }
    }
}

