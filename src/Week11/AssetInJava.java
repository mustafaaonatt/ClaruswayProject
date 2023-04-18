package Week11;

public class AssetInJava {
    public static void main(String[] args) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 3;
        System.out.println("there are " + weekends.length + " weekends in a week.");

        assert  weekends.length == 3 : "There are 2 weekends in a week ";
        System.out.println("Thera are " + weekends.length + " weekends in a week");

        int value = 21;
        assert  value >= 20 : "Underweight";
        System.out.println("value is " + value);

        int x = 2;
        if((x & 1) == 1){
            System.out.println("x is odd number");
        }
        else {

        }
    }
}
