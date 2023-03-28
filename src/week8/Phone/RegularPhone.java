package week8.Phone;

public abstract class RegularPhone extends Phone {
public RegularPhone(int number){
    super(number);
}

    public void call(){
        System.out.println("Dail the number and wait...");
    }
    public void ring(){
        System.out.println("RRRRRR.....RRRR....RRRR");
    }
}
