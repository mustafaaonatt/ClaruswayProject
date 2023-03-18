package week6.HomeWork6.Vehicle;

public class Bikes extends Vehicle{
    private  String tires;

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void seatHeight(){
        System.out.println("You increased your seat height. ");
    }
}
