package week2;

public class PostPreFix {
    public static void main(String[] args) {
        int a =7;
        int b =3;
        System.out.println("Postfix a++ " + a++ +a); // Postfix a++ : 78
        System.out.println("Prefix ++bb " + ++b + b); // Prefix ++b : 44
        // Java is executing left to right in the same lane and top the bottom.
        // If there is a string or text and then int or any number continue in the same  code line(as the same line 7 and 8)
        // Java is converting int to String automatically
        a = 7;
        b = 3;
        System.out.println(a++ + a + "Postfix a++ ");
        System.out.println(++b + b + "Prefix ++b ");

    }
}
