package logicalprograms;

public class CouponNumbers {
    /* Program to generate random coupon numbers in the specified range */
    public static void main(String[] args) {
        String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char[] characters = string.toCharArray();                                            // It converts the given string into a sequence of characters in array
        int range = 200000000;                                                               //Taking the range of integer as high as possible till 2^31
        int random = (int) (Math.random() * range);                                          // To get the random numbers along the range
        String newString = "";                                                               //Creating an empty string
        while (random > 0) {
            char newCharacter = characters[random % characters.length];                      //Storing a value from the array of characters
            newString = newString.concat(String.valueOf(newCharacter));                      //Converting char to string using String.valueOf(char) method
            random /= characters.length;                                                     //With each iteration we are dividing the random number with char length
        }
        System.out.println("The coupon code is : " + newString);
    }
}
