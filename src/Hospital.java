import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private String name;
    private String address;
    private int room;
    private int patient_id;
    public Hospital(String name, String address, int room, int patient_id){
        this.name = name;
        this.address = address;
        this.room = room;
        this.patient_id = patient_id;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Room Number: " + room);
        System.out.println("Patient ID: " + patient_id);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the patient: ");
        String name = scanner.next();
        System.out.print("Enter the address of the patient: ");
        String address = scanner.next();
        System.out.print("Enter the room number: ");
        int room = scanner.nextInt();
        System.out.print("Enter the patient ID: ");
        int patient_id = scanner.nextInt();
        Hospital details = new Hospital(name,address,room,patient_id);
        System.out.println("The details of the patient are : ");
        details.display();
    }


    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrList= new ArrayList<>();



    }*/
}

