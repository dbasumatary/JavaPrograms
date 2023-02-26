/*Printing an array of integer, double and character using generics*/

public class PrintArrayGenerics {
    public static <E> void toPrint(E[] elements){             //declare different variables that are generic types
        for (E element : elements) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 4, 5, 6};
        Double[] doubleNumber = {1.2, 3.2, 4.1, 1.1, 5.3, 3.7};
        Character[] character = {'e','q','k','s','v','d'};
        PrintArrayGenerics.toPrint(integer);
        PrintArrayGenerics.toPrint(doubleNumber);
        PrintArrayGenerics.toPrint(character);
    }
}
