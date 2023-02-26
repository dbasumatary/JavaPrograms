package setoperations;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsSimple {
    public void performAdditionIntoSet(){
        //reference of class Set
        Set<String> strSet = new HashSet<>();

        //Inserting an element into the set
        strSet.add("Praveen");
        strSet.add("Kundan");

        //duplicate can't be stored
        strSet.add("Kundan");

        //can we add null      //yes but no duplicity
        strSet.add(null);
        strSet.add(null);
        System.out.println(strSet);
    }

    public void performBasicOperations(){
        Set<String> strSet = new HashSet<>();
        strSet.add("Tanuja");
        strSet.add("Pallavi");
        strSet.add("Raima");
        strSet.add("Satya");
        //strSet.remove("Satya");

        boolean satyaRemoved = strSet.remove("Satya");
        boolean ashaRemoved = strSet.remove("Ashadeep");
        System.out.println("Sat: " + satyaRemoved);  //true
        System.out.println("Asha: " + ashaRemoved);   //false

        //strSet.clear();   //Set exists but all elements are removed
        //to check whether particular element is present or not
        boolean isAshaPresent = strSet.contains("Ashadeep");
        System.out.println(isAshaPresent);
        System.out.println(strSet);
    }



    public static void main(String[] args) {
        SetOperationsSimple setOperationsSimple = new SetOperationsSimple();
        setOperationsSimple.performAdditionIntoSet();

        //setOperationsSimple.performBasicOperations();
    }
}
