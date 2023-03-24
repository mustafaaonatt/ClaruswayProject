package week7.Vehicle;

public class Plane extends Vehicle {

    private String engineType;

    private int numbersOfWings;


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumbersOfWings() {
        return numbersOfWings;
    }

    public void setNumbersOfWings(int numbersOfWings) {
        this.numbersOfWings = numbersOfWings;
    }


    public Plane(String brand, String model, int NOW, int NOP, String color, String VIN, String engineType, int numbersOfWings) {
        super(brand, model, NOW, NOP, color, VIN);
        this.engineType = engineType;
        this.numbersOfWings = numbersOfWings;
    }

    public Plane(String engineType) {
        this.engineType = engineType;
    }

    public Plane() {

    }

    @Override
    public String toString() {
        String temp = super.toString();
        temp += " The plane has " + (engineType) + " engine and has number of " + numbersOfWings;
        return temp;
    }
}