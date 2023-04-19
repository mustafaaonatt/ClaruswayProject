package week10.HomeWork10;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class GameRokPaperScissors {
    private static LinkedHashMap<String, LinkedHashMap<String, Integer>> games = new LinkedHashMap<>();
    private static Scanner scan = new Scanner(System.in);
    static String entry = " ";
    private static boolean mainMenu = true;
    private static boolean gameMode = false;
    private static boolean statistic = false;

    public static void main(String[] args) {
        getGames().put("WIN", new LinkedHashMap<>());
        getGames().get("WIN").put("Rock", 0);
        getGames().get("WIN").put("Paper", 0);
        getGames().get("WIN").put("Scissors", 0);

        getGames().put("LOSE", new LinkedHashMap<>());
        getGames().get("LOSE").put("Rock", 0);
        getGames().get("LOSE").put("Paper", 0);
        getGames().get("LOSE").put("Scissors", 0);

        getGames().put("DRAW", new LinkedHashMap<>());
        getGames().get("DRAW").put("Rock", 0);
        getGames().get("DRAW").put("Paper", 0);
        getGames().get("DRAW").put("Scissors", 0);

        Console.console();
    }

    public static LinkedHashMap<String, LinkedHashMap<String, Integer>> getGames() {
        return games;
    }

    public static void setGames(LinkedHashMap<String, LinkedHashMap<String, Integer>> games) {
        GameRokPaperScissors.games = games;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void setScan(Scanner scan) {
        GameRokPaperScissors.scan = scan;
    }

    public static boolean isMainMenu() {
        return mainMenu;
    }

    public static void setMainMenu(boolean mainMenu) {
        GameRokPaperScissors.mainMenu = mainMenu;
    }

    public static boolean isGameMode() {
        return gameMode;
    }

    public static void setGameMode(boolean gameMode) {
        GameRokPaperScissors.gameMode = gameMode;
    }

    public static boolean isStatistic() {
        return statistic;
    }

    public static void setStatistic(boolean statistic) {
        GameRokPaperScissors.statistic = statistic;
    }
}
