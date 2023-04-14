package week10;

public class Main {
    public static void main(String[] args) {
        Colors red = Colors.RED;
        Colors green = Colors.GREEN;
        System.out.println(red);

        System.out.println(red.ordinal()); // --> ordinal() methods brings us the index number of value.

        System.out.println(green.ordinal());
        System.out.println(green);

         Days monday = Days.MONDAY;
         Days tuesday = Days.TUESDAY;
         Days thursday = Days.THURSDAY;
         Days friday = Days.FRIDAY;
         Days saturday = Days.SATURDAY;
         Days wednesday = Days.WEDNESDAY;
         Days Sunday = Days.SUNDAY;
        System.out.println(wednesday);
        System.out.println(wednesday.ordinal());

        // ENUM in switch statement
        Colors myColor = Colors.GREEN;
        switch (myColor){
            case RED :
                System.out.println("The color is red");
                break;
            case BLUE:
                System.out.println("The color is blue");
                break;
            case GREEN:
                System.out.println("This color is green");
                break;
            case YELLOW:
                System.out.println("This color is yellow");
                break;
        }
           // We can use enum class as an Array with .values() --> Colors.values()
        for (Colors allColors : Colors.values()) {
            System.out.println(allColors);

        }
        for (int i = 0; i<Colors.values().length ; i++) {
            System.out.println(Colors.values()[i]);
        }

    }

    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
