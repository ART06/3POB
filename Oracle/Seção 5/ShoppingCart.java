public class ShoppingCart {

    public static void main(String[] args) {
        String itemDesc = "Camiseta";
        double price = 25.00;
        int quantity = 2;
        String message;
        
        boolean outOfStock = false;

        if (quantity <= 0) {
            outOfStock = true;
        }

        if (outOfStock) {
            System.out.println("Desculpe, o item " + itemDesc + " não está disponível no momento.");
        } else {
            if (quantity > 1) {
                message = quantity + " unidades de " + itemDesc + "s foram adicionadas ao carrinho.";
            } else {
                message = quantity + " unidade de " + itemDesc + " foi adicionada ao carrinho.";
            }
            
            double totalCost = quantity * price;
            System.out.println(message);
            System.out.println("Custo Total: $" + totalCost);
        }
    }
}