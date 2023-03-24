package week7.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {

    static  Scanner scan = new Scanner(System.in);
    static List<Vehicle> vehicles = new ArrayList<>();

    static {
        Vehicle vehicle = new Vehicle("Tesla","model3",4,5,"red","1234");
        vehicles.add(vehicle);
    }
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
                case 3:
                    addPlane();
                    break;
                case 4:
                    addBoat();
                     break;
                case 5:
                      listAll();
                      break;
                case 8:
                      removeVehicle();
                      break;

            }
            for (Vehicle v : vehicles){
                v.toString();
            }

        }
    }
    public static boolean removeVehicle(){
        boolean flag = false;
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getVIN());
        }
        System.out.print("Please enter VIN to remove it ...> ");
        String vinRemove = scan.next();

        for (int i = 0; i <vehicles.size() ; i++) {
            System.out.println(vehicles.get(i).VIN.equals(vinRemove));
            if (vehicles.get(i).getVIN().equals(vinRemove)){
                System.out.println(vehicles.get(i));
                System.out.println("This "+ vehicles.get(i).getBrand() + vehicles.get(i).getModel()+" car was deleted. ");
                vehicles.remove(i);
                flag = true;
            }

        }
        return flag;





       /* for (Vehicle v :vehicles) {
            if (v.VIN.equals(vinRemove)){
                System.out.println(v.VIN);
                vehicles.remove(v);
                flag = true;
            } */

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


        Vehicle temp = new Vehicle(brand,model,now,nop,color,VIN);
        vehicles.add(temp);


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


        Vehicle temp = new Vehicle (brand,model,now,nop,color,VIN);
        vehicles.add(temp);

    }
    public static void addPlane(){
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

        System.out.print("Enter the VIN...> ");
        String VIN = scan.next();

        System.out.print("Enter plane engine type...> ");
        String engineType = scan.next();

        System.out.print("Enter number of Wings...> ");
        int wingsNumber = scan.nextInt();


        Vehicle temp = new Plane(brand,model,now,nop,color,VIN,engineType,wingsNumber);

        vehicles.add(temp);


    }
    public  static void addBoat(){
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

        System.out.print("Enter the VIN...> ");
        String VIN = scan.next();

        System.out.println("Enter the Boat name...>");
        String name = scan.next();

        System.out.println("Enter the length of the boat ");
        Float length = scan.nextFloat();

        Vehicle temp = new Boat(brand,model,now,nop,color,VIN,name,length);

        vehicles.add(temp);

    }









    public static void listAll(){
        int counter = 1;
        for (Vehicle v : vehicles){
            System.out.println((counter++) + "->" + v.toString());
        }
    }
}

