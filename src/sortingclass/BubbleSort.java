package sortingclass;

public class BubbleSort {
    public void performBubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){            //if size = 8, then go 7 times
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }//print at the end of each inner loop
            for (int k = 0; k< arr.length; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BubbleSort bbsrt = new BubbleSort();
        int[] arr = {12,2,4,80,45,43,32,1};
        bbsrt.performBubbleSort(arr);
        /*for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/
    }
}

