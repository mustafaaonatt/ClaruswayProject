package week7.Vehicle;

public class Car extends  Vehicle{
    private boolean isElectric;
    public String VIN;
    /*

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    */

    public Car(String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN) {
        super(brand, model, NOW, NOP, color);
        this.isElectric = isElectric;
        this.VIN = VIN;
    }

    public String toString(){
        String temp = super.toString();
        temp += "This is " + (isElectric ? " electric " : " gasoline ") +
                " car. It's VIN number is " + VIN + ". ";
        return temp;
    }
}