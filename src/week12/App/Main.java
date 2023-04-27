package week12.App;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static String input = "";
    /* C-reate R-ead U-pdate D-elete */
    private static boolean mainMenu = true;
    private static boolean stdMenu = false;
    private static boolean crMenu = false;
    private static boolean tcMenu = false;
    private static boolean isNew = false;
    private static boolean islist = false;
    private static boolean isUpdate = false;
    private static boolean isDelete = false;

    public static void main(String[] args) {
       while (input.compareTo("P") != 0){
           System.out.println("\n\n");
           if (mainMenu){
               displayMainMenu();
           } else if (stdMenu) {
               displayStdMenu();
           } else if (crMenu) {
               displayCourseMenu();
           } else if (tcMenu) {
               displayTCMenu();
           }

       }
    }

    private static void displayMainMenu(){
        System.out.println("--------------------------EDUCATION APPLICATION------------------------------");
        System.out.println("--------------------------MAIN MENU------------------------------------------");
        System.out.println("(S)tudent");
        System.out.println("(C)ourses");
        System.out.println("(T)aken Courses");
        System.out.println("(P)ower off");
        System.out.println("-------------------------------------------------------------------------->  ");
        input = scan.next().toUpperCase().substring(0,1);
        if (input.compareTo("S") == 0){
            mainMenu = false;
            stdMenu = true;
        } else if (input.compareTo("C") == 0) {
            mainMenu = false;
            crMenu = true;
        } else if (input.compareTo("T") == 0) {
            mainMenu = false;
            tcMenu = true;
        }
    }
    private static void displayStdMenu(){
        System.out.println("--------------------------EDUCATION APPLICATION------------------------------");
        System.out.println("--------------------------STUDENT MENU---------------------------------------");
        System.out.println("(A)dd new student");
        System.out.println("(L)ist of student");
        System.out.println("(U)pdate a student detail");
        System.out.println("(D)elete a student detail");
        System.out.println("(M)ain Menu");
        System.out.println("(P)ower off");
        System.out.print("-------------------------------------------------------------------------->  ");
        input = scan.next().toUpperCase().substring(0,1);
        if (input.compareTo("A") == 0){
            System.out.println("Here we will add new student");
        } else if (input.compareTo("L") == 0) {
            System.out.println("Here we will Display the list of students ");
        } else if (input.compareTo("U") == 0) {
            System.out.println("Here we will update the list of students ");
        } else if (input.compareTo("D") == 0) {
            System.out.println("Here we will delete the student ");
        } else if (input.compareTo("M") ==  0) {
            stdMenu = false;
            mainMenu = true;
        }
    }
    private static void displayCourseMenu(){
        System.out.println("Course menu under development");
        crMenu = false;
        mainMenu = true;
    }
    private static void displayTCMenu(){
        System.out.println("menu under development");
        tcMenu = false;
        mainMenu = true;

    }
}
