import java.util.Random;

public class Game {
    private int creditsRequired;
    private Random randomGenerator;

    public Game(int creditsRequired) {
        this.creditsRequired = creditsRequired;
        this.randomGenerator = new Random();
    }

    public void play(Card card) {
        if (card.getCreditBalance() < creditsRequired) {
            System.out.println("Cartao #" + card.getCardNumber() + ": Creditos insuficientes.");
        } else {
            card.setCreditBalance(card.getCreditBalance() - creditsRequired);
            
            int ticketsWon = randomGenerator.nextInt(51);
            card.setTicketBalance(card.getTicketBalance() + ticketsWon);
            
            System.out.println("Cartao #" + card.getCardNumber() + " jogou!");
            System.out.println("Tiquetes ganhos: " + ticketsWon + " | Novo Total: " + card.getTicketBalance());
        }
    }
}