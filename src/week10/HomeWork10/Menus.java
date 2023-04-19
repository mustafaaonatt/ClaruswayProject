package week10.HomeWork10;

public class Menus {
    public static String selectOption() {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- MAIN MENU -------------");
        System.out.println("(G)ame");
        System.out.println("(S)tatistics");
        System.out.println("(P)ower off");
        System.out.println("-----------------------------------------");
        return GameRokPaperScissors.getScan().next();
    }

    public static String playGame() {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- GAME MENU -------------");
        System.out.println("(R)ock");
        System.out.println("(P)aper");
        System.out.println("(S)cissors");
        System.out.println("------------------------------------------");
        return GameRokPaperScissors.getScan().next();
    }

    public static String whatNext(String result) {
        System.out.println("\n\n");
        System.out.println("-------ROCK - PAPER - SCISSORS--------");
        System.out.println("----------- GAME MODE -------------\n");
        System.out.println("\t\t" + result);
        System.out.println("\n-------(N)ew Game - (M)ain Menu ------------->        ");
        return GameRokPaperScissors.getScan().next();

    }

    public static void displayStatistic(){
        System.out.println("\n\n-------ROCK - PAPER - SCISSORS------------------");
        System.out.println("------------------------- STATISTICS ----------------");
        System.out.println("\t\tWIN \t\t\t\t DRAW \t\t\t\t LOSE");
        System.out.print("\t\tRock : " + GameRokPaperScissors.getGames().get("WIN").get("Rock"));
        System.out.print(" \t\t\t Rock : " + GameRokPaperScissors.getGames().get("DRAW").get("Rock"));
        System.out.println("   \t\t\t Rock : " + GameRokPaperScissors.getGames().get("LOSE").get("Rock"));
        System.out.print("\t\tPaper : " + GameRokPaperScissors.getGames().get("WIN").get("Paper"));
        System.out.print(" \t\t\t Paper : " + GameRokPaperScissors.getGames().get("DRAW").get("Paper"));
        System.out.println("   \t\t\t Paper : " + GameRokPaperScissors.getGames().get("LOSE").get("Paper"));
        System.out.print("\t\tScissors : " + GameRokPaperScissors.getGames().get("WIN").get("Scissors"));
        System.out.print(" \t\t Scissors : " + GameRokPaperScissors.getGames().get("DRAW").get("Scissors"));
        System.out.println("   \t\t Scissors : " + GameRokPaperScissors.getGames().get("LOSE").get("Scissors"));
        System.out.println("---------------------------------------------------------------");
    }
}
