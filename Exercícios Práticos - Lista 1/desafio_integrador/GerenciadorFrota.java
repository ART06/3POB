package desafio_integrador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                writer.write(v.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public void lerDadosDoArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler: " + e.getMessage());
        }
    }
}
}