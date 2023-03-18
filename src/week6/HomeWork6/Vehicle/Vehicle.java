package week6.HomeWork6.Vehicle;

public class Vehicle {
    private String color;
    private String type;
    private int size;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void brake(){
        int speed = 80;
        if(speed==80){
            System.out.println("Please slow down.");
        }else
            System.out.println("You are in good track Thank you.");

    }
    public void showDetails(){
        System.out.println("The vehicle is "+color+", type is "+type+", "+size);

    }
}
