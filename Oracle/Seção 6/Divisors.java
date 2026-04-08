import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
        System.out.print("Divisors of " + num + " = ");

        /*
         'i': variável de controle (contador) iniciada em 1.
         'num': variável de referência fornecida pelo usuário.
         (i < num): o loop continua enquanto 'i' for menor que o número digitado.
         o loop executará exatamente (num - 1) vezes.
         o loop testa cada número de 1 até num-1 para ver se ele divide 'num' sem resto.
         se (num % i != 0) for verdadeiro, o 'continue' interrompe a iteração atual
         e salta para o próximo incremento de 'i', sem imprimir nada.
         se for um divisor, o fluxo ignora o 'if' e executa o comando de impressão.
         */
        for (int i = 1; i < num; i++) {
            // verifica se 'i' não é divisor de 'num'
            if (num % i != 0) {
                continue; // salta para a próxima iteração
            }
            // saída só é executada caso o 'continue' não for acionado
            System.out.print(i + " , ");
        }
        
        console.close();
    }
}