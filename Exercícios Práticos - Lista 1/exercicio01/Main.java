package exercicio01;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente("Ana", 5000.00, 1500.00);
        Funcionario func2 = new Desenvolvedor("Carlos", 4000.00, 8);

        System.out.println(func1.getNome() + ": R$ " + func1.calcularSalario());
        System.out.println(func2.getNome() + ": R$ " + func2.calcularSalario());
    }
}