package week9.Practone;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodsInAction {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        /*
        String names[] = new  String[3];
        names[0] = "Vitalii";
        names[1] = "Mustafa";
        names[2] = "Kawsar";
        */

        Object newList = ((LinkedList<String>)list).clone();

        System.out.println("The List : ");
        for (String str : list){
            System.out.println(str);
        }

        System.out.println("");
        String check = "Bye";
        if(list.contains(check)){
            System.out.println(check + " is available at the index " + list.indexOf(check));
        }else {
            System.out.println(check + " is not available at the index ");
        }
        System.out.println("");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalii");
        names.add("Mustafa");
        names.add("Kawsar");


        list.add("Hello");
        list.addAll(0,names);
        list.add(2,"Bye");

        /*
        0 -> Vitalii
        1 -> Mustafa
        2 -> Bye
        3 -> Kawsar
        4 -> Hello
         */



        for (String str : list){
            System.out.println(str);
        }

    }
}
