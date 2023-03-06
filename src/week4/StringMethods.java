package week4;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = " Python ";
        String str3 = "Java Script   ";


        // Length of String > .length()
          int stringLength = str1.length();
        System.out.println("str1 length is : " + stringLength );

        // equals() methods :
        boolean equalOrNOt = str1.equals("Java");
        System.out.println(equalOrNOt);

        //ChatAt() methods :
        char charAtReturn = str2.charAt(3);
        System.out.println(charAtReturn);

        // Concat() method :
        String newStr2 = str2.concat(" Programming Language.");
        System.out.println(newStr2);
        System.out.println(newStr2.equals(str2.concat(" Programing Languages")));

        //indexOf method
        System.out.println(str3.indexOf("S"));

        // replace() method
        System.out.println(str3.replace('a','i'));

        // startWith() method
        System.out.println(str2.startsWith("Py"));

        //endsWith() method
        System.out.println(str3.endsWith("pt"));

        //substring() method
        System.out.println(str3.substring(7));

        //substring() method int
        System.out.println(newStr2.substring(7,18));

        // toCharArray()
        System.out.println(Arrays.toString(str1.toCharArray()));

        // trim() method
        System.out.println(newStr2.trim());

        // compareTo() method
        System.out.println(str1.compareTo(str2));



    }
}
