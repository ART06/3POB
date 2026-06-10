import java.util.List;

public class VeiculoView {
    
    public void exibirSucesso(String mensagem) {
        System.out.println("Sucesso: " + mensagem);
    }

    public void exibirErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }

    public void listarRelatorioFrota(List<Veiculo> frota) {
        System.out.println("Relatório de veículos.");
        for (Veiculo v : frota) {
            System.out.printf("Placa: %s | Custo Total: R$%.2f%n", v.getPlaca(), v.calcularCustoTotal());
        }
    }

    public void exibirLinhasDoArquivo(List<String> linhas) {
        System.out.println("Conteúdo do arquivo.");
        for (String linha : linhas) {
            System.out.println(linha);
        }
    }
}