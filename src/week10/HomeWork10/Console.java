package week10.HomeWork10;

public class Console {
    public static void console() {
        while (GameRokPaperScissors.entry.compareToIgnoreCase("P") != 0) {
            if (GameRokPaperScissors.isMainMenu()) {
                GameRokPaperScissors.entry = Menus.selectOption();
                if (GameRokPaperScissors.entry.compareToIgnoreCase("G") == 0) {
                    GameRokPaperScissors.setMainMenu(false);
                    GameRokPaperScissors.setGameMode(true);
                } else if (GameRokPaperScissors.entry.compareToIgnoreCase("S") == 0) {
                    GameRokPaperScissors.setMainMenu(false);
                    GameRokPaperScissors.setStatistic(true);

                }
            }

            if (GameRokPaperScissors.isGameMode()) {
                boolean replay = true;
                while (replay) {
                    int comp = (int) (Math.random() * 3);
                    GameRokPaperScissors.entry = Menus.playGame();
                    if (comp == 0) {
                        if (GameRokPaperScissors.entry.compareToIgnoreCase("R") == 0) {
                            GameRokPaperScissors.getGames().get("DRAW").replace("Rock", GameRokPaperScissors.getGames().get("DRAW").get("Rock") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("DRAW GAME");
                        } else if (GameRokPaperScissors.entry.compareToIgnoreCase("P") == 0) {
                            GameRokPaperScissors.getGames().get("WIN").replace("Paper", GameRokPaperScissors.getGames().get("WIN").get("Paper") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER WINS");
                        } else {
                            GameRokPaperScissors.getGames().get("LOSE").replace("Scissors", GameRokPaperScissors.getGames().get("LOSE").get("Rock") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER LOSES");
                        }
                    } else if (comp == 1) {
                        if (GameRokPaperScissors.entry.compareToIgnoreCase("P") == 0) {
                            GameRokPaperScissors.getGames().get("DRAW").replace("Paper", GameRokPaperScissors.getGames().get("DRAW").get("Paper") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("DRAW GAME");
                        } else if (GameRokPaperScissors.entry.compareToIgnoreCase("S") == 0) {
                            GameRokPaperScissors.getGames().get("WIN").replace("Scissors", GameRokPaperScissors.getGames().get("WIN").get("Scissors") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER WINS");
                        } else {
                            GameRokPaperScissors.getGames().get("LOSE").replace("Rock", GameRokPaperScissors.getGames().get("LOSE").get("Rock") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER LOSES");
                        }
                    } else {
                        if (GameRokPaperScissors.entry.compareToIgnoreCase("S") == 0) {
                            GameRokPaperScissors.getGames().get("DRAW").replace("Scissors", GameRokPaperScissors.getGames().get("DRAW").get("Scissors") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("DRAW GAME");
                        } else if (GameRokPaperScissors.entry.compareToIgnoreCase("R") == 0) {
                            GameRokPaperScissors.getGames().get("WIN").replace("Rock", GameRokPaperScissors.getGames().get("WIN").get("Rock") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER WINS");
                        } else {
                            GameRokPaperScissors.getGames().get("LOSE").replace("Paper", GameRokPaperScissors.getGames().get("LOSE").get("Rock") + 1);
                            GameRokPaperScissors.entry = Menus.whatNext("PLAYER LOSES");
                        }
                    }

                    if (GameRokPaperScissors.entry.compareToIgnoreCase("M") == 0) {
                        replay = false;
                        GameRokPaperScissors.setMainMenu(true);
                        GameRokPaperScissors.setGameMode(false);
                    }

                }
            }

            if (GameRokPaperScissors.isStatistic()) {
                GameRokPaperScissors.setMainMenu(true);
                GameRokPaperScissors.setStatistic(false);
                Menus.displayStatistic();
            }

        }
    }
}
