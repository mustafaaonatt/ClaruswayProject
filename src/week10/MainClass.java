package week10;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL));

        System.out.println(Colors.RED.compareTo(Colors.GREEN));
        String enumValue = Size.SMALL.toString();
        System.out.println(enumValue);
    }

}
