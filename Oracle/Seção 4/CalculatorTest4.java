public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double totalMesa = 0;
        
        totalMesa += calc.findTotal(10, "Pessoa 1");
        totalMesa += calc.findTotal(12, "Pessoa 2");
        totalMesa += calc.findTotal(9,  "Pessoa 3");
        totalMesa += calc.findTotal(8,  "Pessoa 4");
        totalMesa += calc.findTotal(7,  "Pessoa 5");
        
        double contaAlex = calc.findTotal(15, "Alex");
        totalMesa += contaAlex;
        
        totalMesa += calc.findTotal(11, "Pessoa 7");
        
        double contaEsquecido = calc.findTotal(30, "Esquecido");
        totalMesa += contaEsquecido;

        System.out.println("\nTotal Bruto da Mesa: $" + totalMesa);
        
        double extras = (contaAlex + contaEsquecido) / 6;
        
        System.out.println("Cada um dos amigos devem adicionar $" + 
                           extras + " para cobrir Alex e o esquecido.");
        System.out.println("Total final da mesa: $" + totalMesa);
    } 
}