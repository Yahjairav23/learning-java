import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // switch statements support: char, byte, short, int, String

        System.out.println("What would you Like to eat today?");
        String food = input.nextLine();

        switch(food) {
            case "tacos":
                System.out.println("Tacos are on the way!");
                break;
            case "burger":
                System.out.println("Burger coming right up!");
                break;
            case "steak":
                System.out.println("One steak coming your way!");
                break;
            default:
                System.out.println("Sorry, but we aren't serving " + food + " today.");
        }
    }
}