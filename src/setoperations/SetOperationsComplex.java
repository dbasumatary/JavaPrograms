package setoperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsComplex {
    public void setOperationsAdvanced(){
        //Set<String> strSet = new HashSet<>();
//        String[] str_Goog = {"Rohith", "Ramesh","Shubham","Tanuja"};
//        String[] str_TCS = {"Praveen", "Kundan","Satya","Sudheer"};
//        String[] str_Infosys = {"Ramesh", "Kundan"};

        Set<String> strSet_Goog = new HashSet<>();
        strSet_Goog.add("Rohit");
        strSet_Goog.add("Ramesh");
        strSet_Goog.add("Tanuja");

        Set<String> strSet_Info = new HashSet<>();
        strSet_Info.add("Rohit");
        strSet_Info.add("Naresh");

        //Google and Infosys
        //Set<String> set_Googl = (Set<String>) Arrays.asList(str_Goog);
        //Set<String> set_TCS = (Set<String>) Arrays.asList(str_TCS);
        //Set<String> set_Infosys = (Set<String>) Arrays.asList(str_Infosys);

        //selected in both google and infosys
        //Arrays.asList(str_Infosys);   //str_Infosys - array of type string
        //Arrays.asList - converted array into list type data structure
        //List belongs to collection framework
        //retailAll needs an object of type collection
        //set_Googl.retainAll(set_Infosys);

        //for intersection operation - retainAll() method
        //retailAll() - it will remove those elements from google set which
        //are present inside infosys set
        boolean result = strSet_Goog.retainAll(strSet_Info);
        System.out.println(result);
        System.out.println(strSet_Goog);
        System.out.println(strSet_Info);
        //Set<String> set_Googl = (Set<String>) Arrays.asList(str_Goog);
    }

    public void performAdvancedOps(){
        //either of google or TCS or Infosys
        Set<String> strSet_Goog = new HashSet<>();
        strSet_Goog.add("Rohit");
        strSet_Goog.add("Ramesh");
        strSet_Goog.add("Tanuja");

        Set<String> strSet_Info = new HashSet<>();
        strSet_Info.add("Rohit");
        strSet_Info.add("Naresh");

        Set<String> strSet_TCS = new HashSet<>();
        strSet_TCS.add("Rajesh");
        strSet_TCS.add("Pallavi");
        strSet_TCS.add("Raima");

        //to perform union operation - present in either of the list
        strSet_Goog.addAll(strSet_TCS);
        System.out.println(strSet_Goog);
        strSet_Goog.addAll(strSet_Info);
        System.out.println(strSet_Goog);
    }

    public void getOnlyOnceElements(){
        Set<String> strSet_Goog = new HashSet<>();
        strSet_Goog.add("Rohit");
        strSet_Goog.add("Ramesh");
        strSet_Goog.add("Tanuja");

        Set<String> strSet_Info = new HashSet<>();
        strSet_Info.add("Rohit");
        strSet_Info.add("Naresh");

        Set<String> strSet_TCS = new HashSet<>();
        strSet_TCS.add("Rajesh");
        strSet_TCS.add("Pallavi");
        strSet_TCS.add("Raima");

        System.out.println(strSet_Goog);
        //it removes those elements which are present inside both sets
        strSet_Goog.removeAll(strSet_Info);
        System.out.println(strSet_Goog);
        strSet_Goog.removeAll(strSet_TCS);
        System.out.println(strSet_Goog);
    }

    public void arrayToSetConvert(){
        String[] str_Goog = {"Rohith", "Ramesh","Shubham","Tanuja"};
        List<String> listGoogl = Arrays.asList(str_Goog);
        //Set<String> set_Goog = (Set<String>) listGoogl;
        //System.out.println(set_Goog);
        Set<String> strKundan = new HashSet<>(listGoogl);
        System.out.println(strKundan);
    }

    public static void main(String[] args) {
        SetOperationsComplex setOperationsComplex= new SetOperationsComplex();
        //setOperationsComplex.setOperationsAdvanced();

        //setOperationsComplex.getOnlyOnceElements();
        setOperationsComplex.arrayToSetConvert();
    }
}

