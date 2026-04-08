import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Digite até 10 números (ou 0 para encerrar antes):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int number = console.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("\nA soma total é: " + sum);
        console.close();
    }
}