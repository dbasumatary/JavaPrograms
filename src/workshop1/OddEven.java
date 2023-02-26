package workshop1;

public class OddEven {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9};
        System.out.print("The odd numbers are: ");
        for (int i = 0; i< array.length; i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        System.out.print("The even numbers are: ");
        for (int i = 0; i< array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }

    }
}

