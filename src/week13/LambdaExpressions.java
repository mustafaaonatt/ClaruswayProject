package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45,46, 55, 35, 25, 67,16 ));
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " " );
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        numbers.stream().forEach((t) -> System.out.print(t + " "));

        numbers.stream().filter(t -> t%2==0).forEach((t) -> System.out.println(t + " "));

        numbers.stream().filter(t-> t < 35 ).forEach(LambdaExpressions::printLambda);

        numbers.stream().filter(t-> t < 35 ).filter(LambdaExpressions::getEven).forEach(LambdaExpressions::printLambda);


    }

    public static void printLambda(int m){
        System.out.println(m + " ");
    }
    public  static boolean getEven(int m){
        return m%2 == 0;
    }

}
