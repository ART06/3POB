import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int validPin = 1234;
        
        System.out.print("Digite o seu PIN: ");
        int enteredPin = console.nextInt();

        while (enteredPin != validPin) {
            System.out.println("PIN incorreto. Tente novamente.");
            System.out.print("Digite o seu PIN: ");
            enteredPin = console.nextInt();
        }

        System.out.println("PIN correto inserido. Acesso à conta concedido.");
        
        console.close();
    }
}