package exercicio01;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * 50.00);
    }
}