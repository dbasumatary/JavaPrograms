package genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class WithAndWithoutGenerics {
    public double withoutGenerics(){
        List list = new ArrayList();
        list.add("Kundan");
        list.add(true);
        list.add(10);        //object data type
        //object to int data typecasting is required here
        double trackScore = (int) list.get(2)/4;
        return trackScore;
    }

    public double withGenerics(){
        List<Integer> listTypeRestricted = new ArrayList<>();
        listTypeRestricted.add(10);    //wrapper class - convert primitive to object
        int assignment = listTypeRestricted.get(0);
        double trackScore = listTypeRestricted.get(0) / 4;
        return trackScore;
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Kundan");
        list.add(true);
        list.add(10);        //object data type

        //int daysAssignment = list.get(2);
        System.out.println(list.get(2));

        List<Integer> listTypeRestricted = new ArrayList<>();
        listTypeRestricted.add(12);
        //listTypeRestricted.add("String");
    }
}
