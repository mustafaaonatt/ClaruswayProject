package week2;

public class SwitchGender {
    public static void main(String[] args) {
        String gender = "female";

        switch (gender) {
            case "female":
                System.out.println("This is a girl. ");
                break;
            case "male":
                    System.out.println("This is a boy. ");
                break;
            default:
                System.out.println("Please enter the correct gender. ");
        }
    }
}
