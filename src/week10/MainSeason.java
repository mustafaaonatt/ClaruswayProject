package week10;

public class MainSeason {
    public static void printSeason(Season season){
        switch (season){
            case SPRING :
                System.out.println("It's spring! ");
                break;
            case SUMMER:
                System.out.println("It's summer! ");
                break;
            case FALL:
                System.out.println("It's fall! ");
                break;
            case WINTER:
                System.out.println("It's winter! ");
                break;
            default:
                System.out.println("Unknown season ");
                break;
        }
    }

    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        printSeason(mySeason);
    }
}
