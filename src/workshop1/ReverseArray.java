package workshop1;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        System.out.print("This is the original array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1 ] = temp;
        }
        System.out.println("This is reversed array: "+ Arrays.toString(array));
    }
}

