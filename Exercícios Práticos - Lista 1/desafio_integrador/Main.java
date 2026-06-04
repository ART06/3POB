package desafio_integrador;

public class Main {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        try {
            Carro c1 = new Carro("ABC12", 800.0, 100);
        } catch (PlacaInvalidaException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        Carro carroValido = new Carro("BRA2E19", 1500.0, 2000);
        Caminhao caminhaoValido = new Caminhao("MCO7A21", 5000.0, 12.5);

        gerenciador.adicionarVeiculo(carroValido);
        gerenciador.adicionarVeiculo(caminhaoValido);

        gerenciador.salvarDadosEmArquivo("frota.txt");
        gerenciador.lerDadosDoArquivo("frota.txt");
    }
}