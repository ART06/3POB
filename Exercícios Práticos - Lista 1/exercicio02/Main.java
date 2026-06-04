package exercicio02;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new Produto("Televisao", 2500.00));
        carrinho.adicionarProduto(new Produto("Liquidificador", 200.00));

        System.out.println("Total: " + carrinho.calcularTotal());
        carrinho.aplicarDescontoGeral(10.0);
        System.out.println("Total com desconto: " + carrinho.calcularTotal());
    }
}