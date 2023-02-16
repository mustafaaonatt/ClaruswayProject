package week2;

public class LogicalOperators {
    public static void main(String[] args) {

// 1) "And" Operator "&&"

        if (5 > 7 && 10 > 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 < 7 && 10 < 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 < 7 && 10 > 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 < 7 && 10 < 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

// 2) "Or" Operator "||"

        if (5 > 7 || 10 > 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 < 7 || 10 < 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 > 7 || 10 < 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if (5 < 7 || 10 < 7)
            System.out.println("Apple");
        else
            System.out.println("Grape");

// 3) "Not" Operator "!"

        if(!(5 > 7 && 10>6))
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if(5 > 7 || !( 10 > 6) )
            System.out.println("Apple");
        else
            System.out.println("Grape");
    }

}
