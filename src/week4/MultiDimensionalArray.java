package week4;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional Array in java
        // In such case, data is stored in row column based index

        int arr1[][] = {{1,2}, {3,4,}, {5,6}};
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));

        int arr[][] = new int[3][2];

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;

        arr[2][0] = 5;
        arr[2][1] = 6;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);
    }
}
