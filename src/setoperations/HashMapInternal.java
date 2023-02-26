package setoperations;

import java.util.HashMap;

public class HashMapInternal {
    public void getHashCode(){
        String asha = "Kundan";         //SCP - part of heap
        String kund1 = new String("Kundan");    //SCP location
        String kund2 = new String("Kundan");    //SCP
        Object objKund = new String("Kundan");
        Object objKund2 = new String("Kundan");

        int hashcode_asha = asha.hashCode();
        //all the below are generating same hashcode
        System.out.println("Kundan Literal hashcode: "+hashcode_asha);
        System.out.println("Kundan1 object's hashcode: "+kund1.hashCode());
        System.out.println("Kundan2 object's hashcode: "+kund2.hashCode());
        System.out.println(objKund.hashCode());
        System.out.println(objKund2.hashCode());

    }

    public static void main(String[] args) {
        HashMapInternal hsmpInyObj1 = new HashMapInternal();
        System.out.println(hsmpInyObj1.hashCode());   //heap area
        HashMapInternal hsmpInyObj2 = new HashMapInternal();
        System.out.println(hsmpInyObj2.hashCode());

        hsmpInyObj1.getHashCode();
    }
}

