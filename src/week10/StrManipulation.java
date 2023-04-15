package week10;

public class StrManipulation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result1 = str1 + " " + str2;

        String result2 = str1.concat(" ").concat(str2);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("result1 String's length is : " +result1.length());

        String substring = result1.substring(0,5);
        System.out.println("substring(0,5) result :  " + substring);

        String strReplace = result1.replace("World", "JAVA");
        System.out.println("replace() method " + strReplace);

        String str = "Hello, World, Java";
        String [] parts = str.split(", ");
        for (String part:parts) {
            System.out.println(part);

        }
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
