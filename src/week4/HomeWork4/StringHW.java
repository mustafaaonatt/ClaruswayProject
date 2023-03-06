package week4.HomeWork4;

public class StringHW {
    public static void main(String[] args) {
//1.Write a Java program to get the character at the given index within the String.
//Sample Output:
//Original String = Java Exercises!
//The character at position 0 is J
//The character at position 10 is i

        String str = "Java Exercise!";
        char chr = str.charAt(7);
        System.out.println(chr);

//2.Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically equal
// if they are the same length and contain the same characters in the same positions.
//Sample Output:
//String 1: This is Exercise 1
//String 2: This is Exercise 2
//"This is Exercise 1" is less than "This is Exercise 2"

        String str1 = "HELLO WORD";
        String str2 = "HELLO WORD";
        int result = str1.compareTo(str2);
        if(result<0)
           System.out.println("str1 is less than str2. ");
        else if (result == 0)
           System.out.println("str1 and str2 are equals.");
        else
           System.out.println("str 1 is greater than str2");


        // 3. Write a Java program to compare two strings lexicographically, ignoring case differences.

        String str3 = "This is exercise 1";
        String str4 = "This is Exercise 1";
        int result1 = str3.compareToIgnoreCase(str4);
        System.out.println(result1);

        // 4. Write a Java program to concatenate a given string to the end of another string.

        String str5 = "PHP Exercises and ";
        String str6 = "Python Exercises";

        System.out.println(str5.concat(str6));

        // 5. Write a Java program to compare a given string to the specified string buffer.

        String str7 = "example.com";
        String str8 = "Example.com";

     // 6. Write a Java program to check whether a given string ends with the contents of another string.

        String str9 = "Python Exercises";
        String str10 = "Python Exercises";

        System.out.println(str9.endsWith(str10));

        // 7. Write a Java program to check whether two String objects contain the same data.

        String str11 = "Stephen Edwin King";
        String str12 = "Stephen Edwin ";
        System.out.println(str11.equals(str12));

        // 8.Write a Java program to compare a given string to another string, ignoring case considerations.

        String str19 = "Stephen King";
        String str20 = "Stephen king";

        System.out.println(str19.equalsIgnoreCase(str20));



        //9.Write a Java program to get the contents of a given string as a character array.

        String str13 = "Mustafa";
        char[] chr1 = str13.toCharArray();
        System.out.println(chr1.toString());


       // 10.Write a Java program to get the index of all the characters of the alphabet.

        String str14 = "Mustafa";
        int y =str14.indexOf(0);
        System.out.println(str14);
         for ( int i = 0; i<str14.length(); i++){
             System.out.print(i);
         }
        System.out.println();

     //   11.Write a Java program to replace a specified character with another character.

        String str15 = "Java Programing language.";
        System.out.println(str15);
         String str16 = str15.replace("Programing","Script and Python ");
        System.out.println(str16);


        // 12.Write a Java program to replace each substring
        // of a given string that matches the given regular expression with the given replacement.

        String str17 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str17);

        System.out.println("New String: " + str17.replaceAll("fox", "cat"));






        }


    }


