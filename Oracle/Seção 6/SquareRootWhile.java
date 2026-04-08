import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Type a non-negative integer: ");
        int number = console.nextInt();
        
        while (number < 0) {
            System.out.print("Invalid number, try again: ");
            number = console.nextInt();
        }
        
        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);
        
        console.close();
    }
}