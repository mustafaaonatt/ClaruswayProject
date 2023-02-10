package week1;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // All variables must be identified with unique names.
        // These unique names are called identifiers.

        /**
         * The general rules for naming variables are:
         * Names can contain letters, digits, underscores, and dollar signs
         * Names must begin with a letter
         * Names should start with a lowercase letter and it cannot contain whitespace
         * Names can also begin with $ and _ (but we will not use it in this tutorial)
         * Names are case sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */



        boolean isClod = true;
        boolean isHeavy = false;

        char initial = 'C';

        byte age = 22;

        short salary = 1000;

        int weight = 100;
        long year = 2023;
        float height = 19.8f;
        double dHeight = 38.8;
        weight = 200;

        /** final keyword
         * set a variable to final, to prevent it from being overridden/modified

         */
        final int number = 99;
        float pi = 3.14f;
        // 5.14f; --> I can not modify the final variable.

        System.out.println(weight);
        System.out.println(year);
        System.out.println(height);
        System.out.println(dHeight);

        System.out.println(isClod);
        System.out.println(isHeavy);
        System.out.println(initial);
        System.out.println(age);
        System.out.println(salary);

    }
}
