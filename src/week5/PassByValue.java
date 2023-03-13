package week5;

public class PassByValue {
    public static void main(String[] args) {
        double price = 100;

        
        discountForVeteran(price);
        discountForSeniors(price);

        System.out.println(price);

    }
    public static void discountForVeteran(double price){
        price = price * 0.80;
        System.out.println(price);
    }

    public static void discountForSeniors(double priceSeniors){
        priceSeniors = priceSeniors * 0.90;
        System.out.println(priceSeniors);
    }



}
