import java.util.Scanner;

public class PlayerCharacterClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a hair color.");
        String hairColor = scan.nextLine();
        System.out.println("Choose a hair style.");
        String hairType = scan.nextLine();
        System.out.println("Choose a shirt (type and color).");
        String shirtType = scan.nextLine();
        System.out.println("Choose pants (type and color).");
        String pantType = scan.nextLine();
        System.out.println("Choose shoes (type and color).");
        String shoes = scan.nextLine();
        System.out.println("Choose an eye color.");
        String eyeColor = scan.nextLine();
        System.out.println("Choose a skin color.");
        String skinColor = scan.nextLine();
        PlayerCharacter player = new PlayerCharacter(hairColor,hairType,shirtType,pantType,shoes,eyeColor,skinColor);
        while (true) {
            System.out.println("What do you want to do? (player stats/looks/money/max speed/vacation/exercise/end session)");
            String input = scan.nextLine();
            if (input.equals("player stats")) {
                player.getPlayerStats();
            } else if (input.equals("looks")) {
                player.getVisual();
            } else if (input.equals("money")) {
                double bal = player.returnBalance();
                System.out.println(bal);
            } else if (input.equals("max speed")) {
                player.runMaxSpeed();
            } else if (input.equals("exercise")) {
                player.exercise();
            } else if (input.equals("vacation")) {
                player.vacation();
                System.out.println("You had a wonderful time.");
            }else if(input.equals("end session")) {
                break;
            } else {
                System.out.println("You inputted something invalid.");
            }
        }
    }
}
