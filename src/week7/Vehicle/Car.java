package week7.Vehicle;

public class Car extends  Vehicle{
    private boolean isElectric;




    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }






    public Car(String brand, String model, int NOW, int NOP, String color, boolean isElectric,String VIN) {
        super(brand, model, NOW, NOP, color,VIN);
        this.isElectric = isElectric;

    }

  //  public  Car(){

  //  }

    public String toString(){
        String temp = super.toString();
        temp += "This is " + (isElectric ? " electric " : " gasoline ") +
                " car. It's VIN number is." ;
        return temp;
    }
}
