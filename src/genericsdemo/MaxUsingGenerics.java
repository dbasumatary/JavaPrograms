package genericsdemo;

//package com.genericsproblem;
import javax.lang.model.element.Element;
import java.lang.*;
/*Maximum of multiple values using generics*/

public class MaxUsingGenerics <T extends Comparable<T>>{        //It ensures the object of type T are comparable using interface
    @SafeVarargs                           //this annotation is used to suppress the unsafe operation warnings at the compile time
    public static <T extends Comparable<T>> T maximumValue(T ... elements){

        T maximum = elements[0];                               //Assuming element in index 0 is the largest initially
        for (T element : elements){                            //using for loop for every element
            if (element.compareTo(maximum) > 0){
                maximum = element;
            }
        }
        return maximum;
        //System.out.println("The maximum value among these elements is " + maximum);
    }
    public static <T> void printMax(T max) {
        System.out.println("Maximum is: " + maximumValue());
    }
    public static void main(String[] args) {
        //maximumValue(32, 56, 89, 3, 456, 78, 45);                          //calling the method for integers
        //maximumValue(5.6, 7.8, 2.9, 18.6, 10.25, 18.6001);                 //calling the method for float values
        //maximumValue( "Mango", "Apple", "Guava", "Orange", "Date");        //calling the method for string values
        MaxUsingGenerics<Integer> maxFind = new MaxUsingGenerics<>();
        //maxFind.printMax(maximumValue(32, 56, 89, 3, 456, 78, 45));
        //printMax(maximumValue(32, 56, 89, 3, 456, 78, 45));
        maxFind.maximumValue(32, 56, 89, 3, 456, 78, 45);
    }
}

