package functionalprogram;

import java.util.Scanner;
/*Program to find roots of quadratic equation (a*x*x + b*x + c)*/
public class Quadratic {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = input.nextDouble();
        double root1, root2, root;
        double determinant = b * b - 4.0 * a * c;                   // Determinant value is b^2 - 4ac
        if (determinant > 0) {                                      // Check if determinant is greater than 0
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);        // Two real and distinct roots
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("First Root = %.3f and Second Root = %.3f", root1, root2);
        }
        else if (determinant == 0) {                           // Two equal roots if determinant is zero
            root1 = root2 = root = -b / (2 * a);
            System.out.format("First Root = Second Root = %.3f;", root);
        }
        else {                                                 // The roots are complex and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("First Root : %.3f+%.3fi", real, imaginary);
            System.out.printf("\nSecond Root : %.3f-%.3fi", real, imaginary);
        }
    }
}
