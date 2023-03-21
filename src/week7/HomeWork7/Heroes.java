package week7.HomeWork7;

public class Heroes extends Person{

    private String power;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Heroes(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }


}
