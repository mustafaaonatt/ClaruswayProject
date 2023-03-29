package week8.GameController;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    Scanner scan = new Scanner(System.in);

   static ArrayList <Game> games = new ArrayList<>();
    public static void main(String[] args) {

       games.add(new Sonic());
       games.add(new Mario());
       games.add(new Contra());

       games.get(0).up();


        char input = 'z';


        /*
        Up        -> U
        Down      -> D
        Right     -> R
        Left      -> L
        A         -> A
        B         -> B
        Selection -> S
         */

        do {
            input = mainMenu();
        }while (input != 'p');

    }
    public static char mainMenu(){
        System.out.println("--------MAIN MENU--------");
        System.out.println("-SELECTED GAME :  ");
        System.out.println("Game Select");
        System.out.println("Game Start");
        System.out.println("-------------------------");
        return  'p';

    }
}
