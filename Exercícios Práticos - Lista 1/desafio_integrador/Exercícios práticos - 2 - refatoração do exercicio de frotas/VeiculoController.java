import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    private List<Veiculo> frota = new ArrayList<>();
    private VeiculoRepository repository = new VeiculoRepository();

    public void cadastrarCarro(String placa, double custoFixo, int km) {
        Carro carro = new Carro(placa, custoFixo, km);
        frota.add(carro);
    }

    public void cadastrarCaminhao(String placa, double custoFixo, double toneladas) {
        Caminhao caminhao = new Caminhao(placa, custoFixo, toneladas);
        frota.add(caminhao);
    }

    public List<Veiculo> obterFrotaEmMemoria() {
        return frota;
    }

    public void persistirDados() {
        repository.salvar(frota);
    }

    public List<String> carregarDadosDoArquivo() {
        return repository.lerLinhas();
    }
}