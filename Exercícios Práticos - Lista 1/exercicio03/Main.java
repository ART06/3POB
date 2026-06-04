package exercicio03;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Bruno", 500.00);

        try {
            conta.sacar(600.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}