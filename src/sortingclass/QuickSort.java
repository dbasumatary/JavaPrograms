package sortingclass;

public class QuickSort {
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //fixed
        int i = low- 1;
        for (int j = low; j <= high-1; j++){
            if (arr[j] < pivot){
                i++;
                //swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap i+1 with the highest index element(fixed)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        //print
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        //return new index of the pivot
        return i+1;

    }
    public void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);   //left sub-array
            //left sub-array means it ends to the left of pivot
            quickSort(arr, pi+1,high);     //right sub-array
            //right sub-array means it starts from right of pivot
        }
    }

    public static void main(String[] args) {
        QuickSort qksrt = new QuickSort();
        int[] arr = {12,2,80,45,43,32,77,11,9};
        qksrt.quickSort(arr,0,8);
    }
}
