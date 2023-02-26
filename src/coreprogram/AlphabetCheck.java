package coreprogram;

import java.util.Scanner;
/*Program to check if the alphabet is vowel or consonant */
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char alphabet = scanner.next().charAt(0);                      //Check the character at index 0
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
                || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println(alphabet + " is a vowel");
        }
        else {
            System.out.println(alphabet + " is a consonant");
        }
    }
}
