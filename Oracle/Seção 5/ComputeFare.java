import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the age: \n");
        
        int age = keyboard.nextInt();
        int fare;

        if (age < 11) {
            fare = 3;
        } else if (age >= 11 && age < 65) {
            fare = 5;
        } else {
            fare = 3;
        }

        System.out.println("A tarifa para a idade " + age + " é: US$ " + fare);
        
        keyboard.close();
    }
}