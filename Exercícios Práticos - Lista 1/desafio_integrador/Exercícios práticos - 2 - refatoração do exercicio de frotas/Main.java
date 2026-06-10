import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeiculoController controller = new VeiculoController();
        VeiculoView view = new VeiculoView();

        try {
            controller.cadastrarCarro("ABC12", 500.0, 100);
        } catch (PlacaInvalidaException e) {
            view.exibirErro("Sistema de validação de placa incorreta funcionou: " + e.getMessage());
        }

        try {
            controller.cadastrarCarro("BRA2E19", 1200.0, 5000);
            controller.cadastrarCaminhao("MCO7A21", 4500.0, 15.4);
            view.exibirSucesso("Veiculos de Carlos e José cadastrados.");
            
            List<Veiculo> emMemoria = controller.obterFrotaEmMemoria();
            view.listarRelatorioFrota(emMemoria);

            controller.persistirDados();
            view.exibirSucesso("Dados gravados no arquivo local.");

            List<String> linhasDoArquivo = controller.carregarDadosDoArquivo();
            view.exibirLinhasDoArquivo(linhasDoArquivo);

        } catch (Exception e) {
            view.exibirErro("Falha inesperada: " + e.getMessage());
        }
    }
}