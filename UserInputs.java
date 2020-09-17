import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text line: ");

        // you have to specify what kind of input you are expecting 
        // String text = input.nextLine();
        // System.out.println("Your line is " + text);


        int integer = input.nextInt();
        System.out.println("Your line is " + integer);
   
        // The scanner methods:
            // nextBoolean()	
            // nextByte()	
            // nextDouble()	
            // nextFloat()	
            // nextInt()	
            // nextLine()	
            // nextLong()	
            // nextShort()
    }
}