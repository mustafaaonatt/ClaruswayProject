package week7.Vehicle;

public class Boat extends Vehicle{

    private String name;
    private float length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Boat(String brand, String model, int NOW, int NOP, String color, String VIN, String name, float length) {
        super(brand, model, NOW, NOP, color, VIN);
        this.name = name;
        this.length = length;
    }

    public Boat(String name, float length) {
        this.name = name;
        this.length = length;
    }

    public String toString(){
        String temp = super.toString();
        temp += " The Boat name is "+name+ " and the length is "+length;
        return temp;
    }
}

