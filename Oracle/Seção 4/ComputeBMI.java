import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o peso em libras: ");
        double peso = sc.nextDouble();
        
        System.out.print("Informe a altura em polegadas: ");
        double altura = sc.nextDouble();
        
        double imcBruto = (peso / Math.pow(altura, 2)) * 703;
        
        long imcArredondado = Math.round(imcBruto);
        
        System.out.println("Seu IMC é " + imcArredondado);
        
        sc.close();
    }
}