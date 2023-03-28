package week8.Phone;

public abstract class Phone {

   // public abstract int number;
    // abstract cannot be used for the properties;
 private int number;

 public Phone(int number){
     this.number = number;
 }
    public abstract void call();
    public abstract void massage();
    public abstract void ring();


    public String toString() {
        return "Phone{" +
                "number=" + this.number +
                '}';
    }
}
