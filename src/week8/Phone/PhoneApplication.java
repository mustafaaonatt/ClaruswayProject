package week8.Phone;

public class PhoneApplication {
    public static void main(String[] args) {
      Phone ph01 = new PhoneWMessage(123654);

      System.out.println( ph01.toString());

      ph01.call();
      ph01.ring();


      ph01.massage();


    }
}
