package week6.HomeWork6.Animals;

public class AppAnimals {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setColor("Red");
        animals.setWeight(80);
        animals.setVegetarian(true);
        animals.setYesNoLegs(false);
        String animalsColor = animals.getColor();
        int weight = animals.getWeight();
        boolean b = animals.isVegetarian();
        boolean c =animals.isVegetarian();




        animals.sleep();

    }
}
