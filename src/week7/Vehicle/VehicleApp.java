package week7.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {

    static  Scanner scan = new Scanner(System.in);
    static List<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {

        int option = -1;

        while (option != 0){
            option = mainMenu();
            switch (option){
                case 1:
                      addCar();
                      break;
                case 2:
                      addTruck();
                      break;
                case 5:
                      listAll();
                      break;
                case 8:
                    System.out.println(" Removed "+removeVehicle());
                      break;

            }
            for (Vehicle v : vehicles){
                v.toString();
            }

        }
    }
    public static boolean removeVehicle(){
        boolean flag = false;
        System.out.print("Please enter VIN to remove it ...>");
        String vinRemove = scan.next();


        for(Iterator<Vehicle> itr = vehicles.iterator(); itr.hasNext();){
            Vehicle vehicle = itr.next();
            if(vehicle.VIN.equals(vinRemove)){
                itr.remove();
                flag = true;

            }


       /* for (Vehicle v :vehicles) {
            if (v.VIN.equals(vinRemove)){
                System.out.println(v.VIN);
                vehicles.remove(v);
                flag = true;
            } */

        }


        return flag;
    }


    public static int mainMenu(){
        int input = 0;
        System.out.println("-------------MAIN MENU---------------");
        System.out.println("1. Add Car");
        System.out.println("2. Add Truck");
        System.out.println("3. Add Plane");
        System.out.println("4. Add Boat");
        System.out.println("5. Add List All");
        System.out.println("6. List by Type");
        System.out.println("7. List by Brand");
        System.out.println("8. Remove Vehicle");
        System.out.println("0. EXIT");
        System.out.println("--------------------");
        input = scan.nextInt();
        return input;
    }

    public static  void addCar(){
       // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand....> ");
        String brand = scan.next();

        System.out.print("Enter the model...> ");
        String model  = scan.next();
        System.out.print("Number of wheels...> ");
        int now = scan.nextInt();
        // scan.next();
        System.out.print("Passenger cap...> ");
        int nop = scan.nextInt();

        System.out.print("Enter the color...> ");
        String color = scan.next();

        System.out.print("(E) Electric (X) Gasoline...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;

        System.out.print("Enter the VIN...> ");
        String VIN = scan.next();


        Car temp = new Car(brand,model,now,nop,color,electric,VIN);
        vehicles.add(temp);
        // linksList.add(link.attr("abs:href").toString());

    }
    public static  void addTruck(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand....> ");
        String brand = scan.next();

        System.out.print("Enter the model...> ");
        String model  = scan.next();

        System.out.print("Number of wheels...> ");
        int now = scan.nextInt();

        System.out.print("Passenger cap...> ");
        int nop = scan.nextInt();

        System.out.print("Enter the color...> ");
        String color = scan.next();

        System.out.print("(E) Electric (X) Gasoline...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;

        System.out.print("Enter the VIN...> ");
        String VIN = scan.next();

        System.out.println("Enter the Load...> ");
        int load = scan.nextInt();


        Truck temp = new Truck(brand,model,now,nop,color,electric,VIN,load);
        vehicles.add(temp);

    }

    public static void listAll(){
        int counter = 1;
        for (Vehicle v : vehicles){
            System.out.println((counter++) + "->" + v.toString());
        }
    }
}

