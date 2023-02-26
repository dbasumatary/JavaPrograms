package quiz;

public class MaximumValue {
    public static int maxValue(int[] price, int[] weight, int bagWeight){
        int numberOfItems = weight.length;
        int [][] array = new int[numberOfItems+1][bagWeight+1];

        for (int i = 0; i<=numberOfItems; i++){
            array[i][0] = 0;
        }
        for (int j = 0; j<=numberOfItems; j++){
            array[0][j] = 0;
        }
        for (int item = 1; item <= numberOfItems; item++){
            for (int wt = 1; wt <= bagWeight; wt++){
                if (weight[item-1]<=wt){
                    array[item][wt] = Math.max(price[item-1]+array[item-1][wt-weight[item-1]],array[item-1][wt]);
                }
                else{
                    array[item][wt] = array[item-1][wt];
                }
            }
        }
        for (int[] rows : array){
            for (int col : rows){
                System.out.printf("%6d", col);
            }
            System.out.println();
        }
        return array[numberOfItems][bagWeight];
    }

    public static void main(String[] args) {
        int[] price = {23000, 28000, 35000, 27000};
        int[] weight = {17, 23, 27, 22};
        int bagWeight = 55;
        System.out.println(maxValue(price,weight,bagWeight));
    }
}

