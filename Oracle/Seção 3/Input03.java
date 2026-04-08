import java.util.Scanner;

class Input03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três números inteiros separados por espaços: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int soma = num1 + num2 + num3;
        
        System.out.println("A soma dos números inseridos é: " + soma);
        
        sc.close();
    }
}