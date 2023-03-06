package week4.HomeWork4;

import java.util.Arrays;

public class TuesdayPart1 {
    public static void main(String[] args) {
        //1. Write a Java program to sort a numeric array and a string array.
         int [] numbers = {1,7,3,11,2};
         String words[]= {"orange", "apple", "banana"};

        System.out.println("Original numeric array : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array : " + Arrays.toString(numbers));

        System.out.println("Original string array : "+ Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted string array : "+ Arrays.toString(words));




      /*   for (int i = 0; i<numbers.length; i++){
             System.out.print(numbers[i] + " ");
         } System.out.println();
         for (int i = 0; i< words.length; i++){
            System.out.print(words[i] + " ");
        }
*/
         // 2. Write a Java program to sum values of an array.
        int [] numbers1 = {6,7,8,9,0};
         int sum = 0;
         for (int i = 0; i<numbers.length; i++){
            // sum= sum + numbers1[i];
             sum += numbers1[i];
         }
        System.out.println("\nSum is : " + sum);

         //3. Write a Java program to calculate the average value of array elements.
        int numbers2 [] = {10,11,12,13,14};
        int Avg;
        int sum2 = 0;
        for (int i = 0; i<numbers2.length; i++) {
            sum2 += numbers2[i];
        }
        Avg = sum2/ numbers2.length;
          System.out.println("Average is : " + Avg);

          //4. Write a Java program to test if an array contains a specific value. For example an int array contains
        // 99 or not?

        int numbers3 [] = {344,555,66,88,999,66,55};
        int number4 = 88;
        System.out.println(contains(numbers3,number4));
               // OR //
        boolean check = contains(numbers3, 111);
        System.out.println(check);


        //Q5

       String arrayCar[] = {"BMW","HONDA", "TOYOTA", "HYUNDAI", "AUDIA"};
       String carElement = "HONDA";
        int indexNumber = finIndexOfElement(arrayCar,carElement);


        if(indexNumber != -1)
            System.out.println("carElement's index number is " + indexNumber);
        else System.out.println("There is no such an element in arrayCar. ");


         }

    public static boolean contains(int arr[], int specificNumber){
        boolean result= false;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == specificNumber) result =true;

        }


        return result;

    }

    //5. Write a Java program to find the index of an array element.
    public static  int finIndexOfElement(String arr[],String element){
        int result = -1;
        for(int i = 0; i< arr.length; i++){
            if(element.equals(arr[i]))result = i;
        }


        return  result;
    }



      //6. Write a Java program to remove a specific element from an array.

    public static  void removeElement(String arr[], String removeElement){
        int counter = 0;
        for (String str : arr){

            if(arr.equals(removeElement)){
                //Solution 1:
                arr[counter]= "Free-1";
                System.out.println(arr[counter]+ "index number : " + counter);
                counter++;

                //Solution 2 :
                 int indexNum = finIndexOfElement(arr,removeElement);
                 arr[indexNum] = "Free-2";
                System.out.println(arr[indexNum] + "index number : " + indexNum);
            }
        }
        //Solution 3 :
    //    for(int i = 0; i< arr.length; i++){
//            if (arr[i].equals(removeElement)) arr[i] = "Free-3";
//            System.out.println();
//
 //           }


        }

    }






