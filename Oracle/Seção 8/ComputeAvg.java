import java.util.Scanner;
public class ComputeAvg {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        double[] scores = new double[5];
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Digite a pontuação do teste " + (i + 1) + ": ");
            scores[i] = in.nextDouble();
            sum += scores[i];
        }
        double average = sum / scores.length;

        System.out.println("\nResumo:");
        System.out.println("Soma total: " + sum);
        System.out.println("Média do estudante: " + average);
        
        in.close();
    }
}