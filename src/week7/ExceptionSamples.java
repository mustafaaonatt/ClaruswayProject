package week7;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionSamples {
    public static void main(String[] args) {
        int num1,num2;
        FileInputStream file = null;
      try {

          num1 = 0;
          num2 = 62 / num1;
          System.out.println(num2);
          System.out.println("This is the end of the try block ");
          file = new FileInputStream("c : textfile.txt");
      }catch(ArithmeticException e){
            System.out.println("We can not divide the number by zero(Arithmetic Exception). ");
      } catch (IOException e){
          System.out.println("Reading file exception. ");
      }
        System.out.println("THIS IS NOT IN try catch ");

    }

}
