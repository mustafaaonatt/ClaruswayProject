package week6.inheritance2;

public class BagApp {
    public static void main(String[] args) {
        ShoppingBag sb01 = new ShoppingBag();
        sb01.setCompany("ACME");
        sb01.setColor("White");
        sb01.setMaterial("plastic");
        sb01.setVolume(1500);

        sb01.display();
        sb01.details();

      sb01.add(750);
      sb01.add(500);
      sb01.add(250);

      sb01.display();
      sb01.remove(1250);
      sb01.display();

    }
}
