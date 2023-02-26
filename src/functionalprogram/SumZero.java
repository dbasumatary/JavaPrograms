package functionalprogram;

import java.util.Scanner;
/*Program to find the sum of three integer adds to zero*/
public class SumZero {
    static void findTriplets(int[] array, int n) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);    //Print distinct triplets
                        count += 1;                                                        //No. of distinct triplets
                        found = true;
                    }
                }
            }
        }
        System.out.println("The number of distinct triplets are " + count);      //Print distinct no. of triplets
        if (!found) {                                                           // If no triplet with sum 0 found in array
            System.out.println(" The triplets does not exist ");
        }
    }

    public static void main(String[] args) {
        int length;
        System.out.print("Enter the number of elements to store: ");                     //Size of the array
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the elements of array: ");                     //Elements of the array with size length
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        findTriplets(array, length);                                            //Printing the distinct triplets
    }
}
