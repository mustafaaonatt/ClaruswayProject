package week10;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // .compareTo() compares the ENUM constants based on their ordinal values/index number
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL));

        System.out.println(Colors.RED.compareTo(Colors.GREEN));


        String enumValue = Size.SMALL.toString();
        System.out.println(enumValue);

        String eValue = String.valueOf(Size.SMALL);
        System.out.println(enumValue);

        Size size = Size.LARGE;
        System.out.println(size.name());

        System.out.println(Size.valueOf("EXTRALARGE"));

        Size[] enumArray = Size.values();
        System.out.println(Arrays.toString(enumArray));

    }

}
