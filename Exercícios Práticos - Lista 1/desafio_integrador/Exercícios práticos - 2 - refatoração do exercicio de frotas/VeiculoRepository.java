import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoRepository {
    private final String nomeArquivo = "frota.txt";

    public void salvar(List<Veiculo> frota) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                writer.write(v.dadosParaArq());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar arquivo.");
        }
    }

    public List<String> lerLinhas() {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo.");
        }
        return linhas;
    }
}