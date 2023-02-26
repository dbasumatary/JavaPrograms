package genericsdemo;

public class DisplayWithGenerics<T>{
    public void display(T element1){
        System.out.println(element1);
        //return element1 + element2;
    }

    public static void main(String[] args) {
        /*DisplayWithGenerics displayWithGenerics = new DisplayWithGenerics();
        displayWithGenerics.display("rfp");
        displayWithGenerics.display(34);
        displayWithGenerics.display(true);*/

        DisplayWithGenerics<String> displayStrOnly = new DisplayWithGenerics<>();
        displayStrOnly.display("Kundan");
        //displayStrOnly.display(true);

        DisplayWithGenerics<Boolean> displayBoolean = new DisplayWithGenerics();
        displayBoolean.display(true);
    }
}

