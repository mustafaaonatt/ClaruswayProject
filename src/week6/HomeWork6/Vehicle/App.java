package week6.HomeWork6.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle vhc = new Vehicle();
        Bikes bks = new Bikes();
        Cars cars = new Cars();
        SportCars spr = new SportCars();


        bks.setColor("Red");
        bks.setType("Engine");
        bks.setSize(200);
        bks.setTires("Mountain");
        cars.setMake("Toyota");



        cars.getMake();

        bks.brake();
        spr.startNitro();
        bks.showDetails();
        bks.seatHeight();
    }
}
