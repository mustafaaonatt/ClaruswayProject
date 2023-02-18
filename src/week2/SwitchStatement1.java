package week2;

import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the T-Shirt Size (29,42,44,48): ");
        int size = scan.nextInt();
        String sizeWord = "small";

        switch (size){
            case 29 :
                sizeWord = "Small";
                break;

            case 42 :
                sizeWord = "Medium";
            break;

            case 44 :
                sizeWord ="Large";
                break;

            case 48  :
                sizeWord = "Extra - Large";
                break;

            default:
                sizeWord = "Unknown";

        }
        System.out.println("T-shirt size is " + sizeWord);

    }
}
