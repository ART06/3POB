package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        itens.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : itens) {
            p.aplicarDesconto(percentual);
        }
    }
}