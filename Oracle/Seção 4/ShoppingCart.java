public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Arthur Antunes";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");

        firstName = custName.substring(0, spaceIdx);

        System.out.println("Primeiro nome: " + firstName);
        
        System.out.println("Índice do espaço: " + spaceIdx);
    }
}