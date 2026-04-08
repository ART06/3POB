public class Tip01 {
    public static void main(String[] args) {
        double tax = 0.05;
        double tip = 0.15;
        double totalMult = 1 + tax + tip;

        double p1 = 10, p2 = 12, p3 = 9, p4 = 8;
        double p5 = 7, p6 = 15, p7 = 11, p8 = 30;

        // Cálculo e Impressão
        System.out.println("Total da Pessoa 1: $" + (p1 * totalMult));
        System.out.println("Total da Pessoa 2: $" + (p2 * totalMult));
        System.out.println("Total da Pessoa 3: $" + (p3 * totalMult));
        System.out.println("Total da Pessoa 4: $" + (p4 * totalMult));
        System.out.println("Total da Pessoa 5: $" + (p5 * totalMult));
        System.out.println("Total da Pessoa 6 (Alex): $" + (p6 * totalMult));
        System.out.println("Total da Pessoa 7: $" + (p7 * totalMult));
        System.out.println("Total da Pessoa 8: $" + (p8 * totalMult));
        
        double totalGeral = (p1+p2+p3+p4+p5+p6+p7+p8) * totalMult;
        System.out.println("\nTotal Geral da Conta: $" + totalGeral);
    }    
}