package week4;

public class StringBuilderClass {
    public static void main(String[] args) throws Exception {
        // create a StringBuilder object with  String pass parameter

        StringBuilder str = new StringBuilder("AAAAAAABBBBBCCCC");

        // print the string
        System.out.println("String = " + str.toString());

        //reverse the string
        StringBuilder reverseStr = str.reverse();

        //Append ', '(44) to  the String
        str.append(44);


        //Print the motified String
        System.out.println("Modifified String Builder = " + str);

        // get capacity
         int capacity = str.capacity();


         // print the result
        System.out.println("StringBuilder = " +  str);
        System.out.println("Capacity of StringBuilder = " + capacity);



    }
}
