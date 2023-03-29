package week8.GameController;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Game> games = new ArrayList<>();
    static boolean isMainMenu = true;
    static int mainMenuOption = 1;
    static boolean isGameSelect = false;
    static int gameMenuOption = 1;
    static boolean isGamePlay = false;
    static int selectedGame = 0;
    static char input = 'z';
     /*
        Up        -> U
        Down      -> D
        Right     -> R
        Left      -> L
        A         -> A
        B         -> B
        Selection -> S
     */

    public static void main(String[] args) {

        games.add(new Sonic());
        games.add(new Mario());
        games.add(new Contra());


        do {
            if (isMainMenu) {
                input = mainMenu();
                if (input == 'D') {
                    if (mainMenuOption == 1) {
                        mainMenuOption = 2;
                    }
                } else if (input == 'U') {
                    mainMenuOption = 1;

                } else if (input == 'S') {
                    if (mainMenuOption == 1) {
                        isGameSelect = true;
                        isMainMenu = false;
                        mainMenuOption = 1;
                    } else {
                        isGamePlay = true;
                        isMainMenu = false;
                        mainMenuOption = 1;
                    }

                }

            }

            if (isGameSelect) {
                input = gameMenu();
                if (input == 'D') {
                    if (gameMenuOption == 3) {
                        gameMenuOption++;
                    }
                } else if (input == 'U') {
                    if (gameMenuOption != 1) {
                        gameMenuOption--;

                    } else if (input == 'S') {
                        isMainMenu = true;
                        isGameSelect = false;
                        selectedGame = gameMenuOption - 1;
                        gameMenuOption = 1;

                    }
                }
                if (isGamePlay) {
                    // TODO
                }
                System.out.println("\n\n");
            }
        }
        while (input != 'P') ;
    }



    public static char mainMenu(){
        System.out.println("--------MAIN MENU--------");
        System.out.println("-SELECTED GAME : "+ (selectedGame == 0 ? "SONIC" : (selectedGame == 1 ? "MARIO" : "CONTRA")) + " -");
        if (mainMenuOption == 1){
            System.out.println("\t -> Game Select <- ");
            System.out.println("Game Start");
        } else if (mainMenuOption == 2) {
            System.out.println("Game Select");
            System.out.println("\t -> Game Start <-");
        }

        System.out.print("---(D)own---(U)p---(S)elect----");

        return scan.next().charAt(0);

    }


    public static char gameMenu(){
        System.out.println("--------MAIN MENU--------");
        System.out.println("-SELECTED GAME : "+ (selectedGame == 0 ? "SONIC" : (selectedGame == 1 ? "MARIO" : "CONTRA")) + " -");
        if (mainMenuOption == 1){
            System.out.println("\t -> SONIC <- ");
            System.out.println("MARIO");
            System.out.println("CONTRA");
        } else if (mainMenuOption == 2) {
            System.out.println("SONIC");
            System.out.println("\t -> MARIO <-");
            System.out.println("CONTRA");
        } else if (gameMenuOption == 3) {
            System.out.println("SONIC");
            System.out.println("MARIO");
            System.out.println("\t -> CONTRA <-");

        }

        System.out.print("---(D)own---(U)p---(S)elect----");

        return scan.next().charAt(0);

    }
}