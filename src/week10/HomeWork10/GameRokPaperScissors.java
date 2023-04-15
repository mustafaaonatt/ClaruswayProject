package week10.HomeWork10;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class GameRokPaperScissors {
    static LinkedHashMap<String, LinkedHashMap<String, Integer>> games = new LinkedHashMap<>();
    static Scanner scan = new Scanner(System.in);
    static String entry = " ";
    static boolean mainMenu = true;
    static boolean gameMode = false;
    static boolean statistic = false;

    public static void main(String[] args) {
        games.put("WIN", new LinkedHashMap<>());
        games.get("WIN").put("Rock", 0);
        games.get("WIN").put("Paper", 0);
        games.get("WIN").put("Scissors", 0);

        games.put("LOSE", new LinkedHashMap<>());
        games.get("LOSE").put("Rock", 0);
        games.get("LOSE").put("Paper", 0);
        games.get("LOSE").put("Scissors", 0);

        games.put("DRAW", new LinkedHashMap<>());
        games.get("DRAW").put("Rock", 0);
        games.get("DRAW").put("Paper", 0);
        games.get("DRAW").put("Scissors", 0);

        while (entry.compareToIgnoreCase("P") != 0) {
            if (mainMenu) {
                entry = selectOption();
                if (entry.compareToIgnoreCase("G") == 0) {
                    mainMenu = false;
                    gameMode = true;
                } else if (entry.compareToIgnoreCase("S") == 0) {
                    mainMenu = false;
                    statistic = true;

                }
            }

            if (gameMode) {
                boolean replay = true;
                while (replay) {
                    int comp = (int) (Math.random() * 3);
                    entry = playGame();
                    if (comp == 0) {
                        if (entry.compareToIgnoreCase("R") == 0) {
                            games.get("DRAW").replace("Rock", games.get("DRAW").get("Rock") + 1);
                            entry = whatNext("DRAW GAME");
                        } else if (entry.compareToIgnoreCase("P") == 0) {
                            games.get("WIN").replace("Paper", games.get("WIN").get("Paper") + 1);
                            entry = whatNext("PLAYER WINS");
                        } else {
                            games.get("LOSE").replace("Scissors", games.get("LOSE").get("Rock") + 1);
                            entry = whatNext("PLAYER LOSES");
                        }
                    } else if (comp == 1) {
                        if (entry.compareToIgnoreCase("P") == 0) {
                            games.get("DRAW").replace("Paper", games.get("DRAW").get("Paper") + 1);
                            entry = whatNext("DRAW GAME");
                        } else if (entry.compareToIgnoreCase("S") == 0) {
                            games.get("WIN").replace("Scissors", games.get("WIN").get("Scissors") + 1);
                            entry = whatNext("PLAYER WINS");
                        } else {
                            games.get("LOSE").replace("Rock", games.get("LOSE").get("Rock") + 1);
                            entry = whatNext("PLAYER LOSES");
                        }
                    } else {
                        if (entry.compareToIgnoreCase("S") == 0) {
                            games.get("DRAW").replace("Scissors", games.get("DRAW").get("Scissors") + 1);
                            entry = whatNext("DRAW GAME");
                        } else if (entry.compareToIgnoreCase("R") == 0) {
                            games.get("WIN").replace("Rock", games.get("WIN").get("Rock") + 1);
                            entry = whatNext("PLAYER WINS");
                        } else {
                            games.get("LOSE").replace("Paper", games.get("LOSE").get("Rock") + 1);
                            entry = whatNext("PLAYER LOSES");
                        }
                    }

                    if (entry.compareToIgnoreCase("M") == 0) {
                        replay = false;
                        mainMenu = true;
                        gameMode = false;
                    }

                }
            }

            if (statistic) {
                mainMenu = true;
                statistic = false;
                displayStatistic();
            }

        }
    }

    public static String selectOption() {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- MAIN MENU -------------");
        System.out.println("(G)ame");
        System.out.println("(S)tatistics");
        System.out.println("(P)ower off");
        System.out.println("-----------------------------------------");
        return scan.next();
    }

    public static String playGame() {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- GAME MENU -------------");
        System.out.println("(R)ock");
        System.out.println("(P)aper");
        System.out.println("(S)cissors");
        System.out.println("------------------------------------------");
        return scan.next();
    }

    public static String whatNext(String result) {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- GAME MODE -------------\n");
        System.out.println("\t\t" + result);
        System.out.println("\n-------(N)ew Game - (M)ain Menu ------------->        ");
        return scan.next();

    }
    public static void displayStatistic(){
        System.out.println("\n\n-------ROCK - PAPER - SCISSORS------------------");
        System.out.println("------------------------- STATISTICS ----------------");
        System.out.println("\t\tWIN \t\t\t\t DRAW \t\t\t\t LOSE");
        System.out.print("\t\tRock : " +games.get("WIN").get("Rock"));
        System.out.print(" \t\t\t Rock : " +games.get("DRAW").get("Rock"));
        System.out.println("   \t\t\t Rock : " +games.get("LOSE").get("Rock"));
        System.out.print("\t\tPaper : " +games.get("WIN").get("Paper"));
        System.out.print(" \t\t\t Paper : " +games.get("DRAW").get("Paper"));
        System.out.println("   \t\t\t Paper : " +games.get("LOSE").get("Paper"));
        System.out.print("\t\tScissors : " +games.get("WIN").get("Scissors"));
        System.out.print(" \t\t Scissors : " +games.get("DRAW").get("Scissors"));
        System.out.println("   \t\t Scissors : " +games.get("LOSE").get("Scissors"));
        System.out.println("---------------------------------------------------------------");
    }
}
