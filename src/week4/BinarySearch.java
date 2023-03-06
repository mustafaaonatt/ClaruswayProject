package week4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2,4,46,8,14,7};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,7));

        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 55));

        int arr1[] = {2,1,7,6};
        int arr2[] = {2,1,7,6};
        System.out.println(Arrays.equals(arr1,arr2));

        int arr3[] = {3,2,8,7,11};
        int arr4[] = {7,8,3,11,2};
        System.out.println(Arrays.equals(arr3,arr4));

        int arr5[] = {4,5,8,9,10};
        int arr6[] = {8,9,4,10,5};
        Arrays.sort(arr5);
        Arrays.sort(arr6);
        System.out.println(Arrays.equals(arr5,arr6));

        int arr[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        //Split method:
        String str ="What about Java; Did you like it?";
        String arr7 [] = str.split(";");
        System.out.println(arr7[0]);
        System.out.println(arr7[1]);


    }
}
