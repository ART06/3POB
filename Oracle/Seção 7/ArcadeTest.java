public class ArcadeTest {
    public static void main(String[] args) {
        PrizeCategory urso = new PrizeCategory("Urso", 50, 2);
        PrizeCategory anel = new PrizeCategory("Anel Plástico", 10, 10);
        PrizeCategory console = new PrizeCategory("Video Game", 500, 1);
        Terminal terminal = new Terminal(urso, anel, console);

        Card card1 = new Card();
        Card card2 = new Card();

        terminal.loadCredits(card1, 20);
        terminal.loadCredits(card2, 10);
        Game spaceInvaders = new Game(15);
        spaceInvaders.play(card1);
        spaceInvaders.play(card2);

        terminal.transferCredits(card1, card2, 10);

        terminal.exchangeTickets(card2, anel);

        System.out.println("\nTestando Card 1 sem saldo");
        spaceInvaders.play(card1);
        terminal.exchangeTickets(card1, console);
    }
}