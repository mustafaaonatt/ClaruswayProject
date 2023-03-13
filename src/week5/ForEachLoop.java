package week5;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr [] = {15,17,20,25,35,40};
       // ForEach loop
        int counter = 0;
        for (int arrElementValue : arr){
            if(counter == arr.length-1) System.out.println(arrElementValue);
            else System.out.print(arrElementValue + ", ");
            counter++;
        }
        // for loop
        for (int i = 0; i< arr.length; i++)
         if( i == arr.length-1) System.out.println(arr[i]);
        else  System.out.print(arr[i] + ", ");


        String strArr[] = {"Banana", "Apple", "Orange", "Cherry", "Strawberry", "Mango", "Durian"};

        // iterating the array with ForEach Loop
        for(String str : strArr){
            System.out.print(str + " ");
        }

        System.out.println();
        // iterating the array with ForLoop
        for (int i = 0; i < strArr.length; i++){
            System.out.print(strArr[i] + " ");
        }

        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Bill");
        list.add("Mark");
        list.add("Elon");
        for(String str : list){
            System.out.print(str + " ");
        }


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(50);
        list1.add(99);

        System.out.println();
        for (int i : list1){
            System.out.print(i + " ");
        }



    }
}
