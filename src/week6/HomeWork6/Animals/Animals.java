package week6.HomeWork6.Animals;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Animals {
    private String color;
    private int weight;
    private boolean yesNoLegs;
    private boolean vegetarian;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isYesNoLegs() {
        return yesNoLegs;
    }

    public void setYesNoLegs(boolean yesNoLegs) {
        this.yesNoLegs = yesNoLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public  void eat(){
        boolean isHungry = false;

        if(isHungry!= false)
            System.out.println("Go and find to grab sth. ");
        else
            System.out.println("You are full now!! Don't eat more!! ");

    }
    public  void sleep(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Time : " +dtf.format(time));
        LocalTime time1 = LocalTime.parse("23:59");
        if(time.isAfter(time1))
            System.out.println("sleep");
        else
            System.out.println("Don't sleep");

    }

}
