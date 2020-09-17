import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Guess a number, any number! ");
        number = input.nextInt();

        } while(number != 7);
        
        if (number == 7) {
            System.out.println("Congrats! You guessed right!");
        };

    }
}