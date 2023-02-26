

public class SecondLargest {
    public static void main(String[] args) {
        //Finding the Second-Largest element of an array
        int [] secondLargest = {4, 7, 8, 1, 6, 3, 5};
        int var;
        for (int i = 0; i < secondLargest.length; i++){
            for (int j = i + 1; j < secondLargest.length; j++){
                //Comparing the elements and swapping them in ascending order
                if (secondLargest[i] > secondLargest[j]){
                    var = secondLargest[i];
                    secondLargest[i] = secondLargest[j];
                    secondLargest[j] = var;
                }
            }
        }
        System.out.println(secondLargest[secondLargest.length-2]);
    }
}

