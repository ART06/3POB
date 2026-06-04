package exercicio03;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado) {
        super("Saldo: R$ " + saldoDisponivel + ". Solicitado: R$ " + valorSolicitado);
    }
}