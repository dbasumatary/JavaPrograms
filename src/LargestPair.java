class LargestPair{
    static int findLargest( int []arr)
    {
        int result = arr[0] * arr[1];
        //int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (result < arr[i] * arr[j]) {
                    result = arr[i] * arr[j];

                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int []arr = {1, 3, -9, -5, 2, 7, 10};
        //int []arr = {2, -3};
        int n = arr.length;
        findLargest(arr);
        //System.out.println(findLargest(arr));
    }
}

