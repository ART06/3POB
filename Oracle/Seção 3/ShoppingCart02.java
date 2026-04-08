public class ShoppingCart02 {
    String custName = "Alex";
        String itemDesc = "Camisa";
        String menssage = custName+" wants to purchase a "+itemDesc;
        
        double preco=25.00;
        double imposto=5.50;
        int quantidade=2;

        double totalPreco=(preco+imposto)*quantidade;
    public void main(String[] args) {
        menssage = custName + " quer comprar " + quantidade + " " + itemDesc+"(s)";
        System.out.println(menssage);
        menssage="O custo total com imposto fica R$" + totalPreco;
        System.out.println(menssage);
    }
}
