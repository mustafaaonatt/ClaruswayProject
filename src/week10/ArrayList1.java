package week10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> listColor = new ArrayList<>();
        listColor.add("Green");
        listColor.add("Blue");
        listColor.add("Red");
        listColor.add("White");
        listColor.add("Orange");
        System.out.println(listColor);
        int index = 0;
        for (String l : listColor){
            if(index == listColor.size()-1){
                System.out.println(l);
            }else {
                System.out.print(l + ", ");
            }
            index++;
        }
    }
}
