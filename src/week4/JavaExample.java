package week4;

public class JavaExample {
    // static variables ( belongs to class)
    static int i = 100;
    static  String s = "Beginnersbook";
    // instance variables(belongs to object)
    String name = "Ahmet";

    // static method
    static void display(){
        //We can only display variables from static methods.
        System.out.println("i : " + i);
        System.out.println("s : "+ s);
    }

    //non-static method
    void funcn(){
        // static methods can call in static methods

        display();
    }

     //static main method
    public static void main(String[] args) {
        System.out.println("i : " + i);
        System.out.println("s : " + s);
        // create an object from JavaExample class.
        JavaExample myJava = new JavaExample();
        // we are calling  an instance variables through the object
        System.out.println(myJava.name);
        //we need to call non-static methods through the object
        myJava.funcn();
        //we can call static methods directly from static methods.
        display();

//        funcn(); -->> we can not call non- static methods from static methods


    }
}
