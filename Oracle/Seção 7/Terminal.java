public class Terminal {
    private PrizeCategory p1, p2, p3;

    public Terminal(PrizeCategory p1, PrizeCategory p2, PrizeCategory p3) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3;
    }

    public void loadCredits(Card card, int money) {
        int credits = money * 2;
        card.setCreditBalance(card.getCreditBalance() + credits);
        System.out.println("Cartao #" + card.getCardNumber() + " carregado com " + credits + " creditos.");
    }

    public void checkStatus(Card card) {
        System.out.println("STATUS CARTAO #" + card.getCardNumber() + " ");
        System.out.println("Creditos: " + card.getCreditBalance());
        System.out.println("Tiquetes: " + card.getTicketBalance());
    }

    public void transferCredits(Card from, Card to, int amount) {
        if (from.getCreditBalance() >= amount) {
            from.setCreditBalance(from.getCreditBalance() - amount);
            to.setCreditBalance(to.getCreditBalance() + amount);
            System.out.println("Transferencia de creditos concluida.");
            checkStatus(from);
            checkStatus(to);
        } else {
            System.out.println("Saldo insuficiente para transferencia.");
        }
    }

    public void exchangeTickets(Card card, PrizeCategory prize) {
        if (prize.getInventory() <= 0) {
            System.out.println("Erro: Premio " + prize.getName() + " esgotado!");
        } else if (card.getTicketBalance() < prize.getTicketsRequired()) {
            System.out.println("Erro: Tiquetes insuficientes para " + prize.getName());
        } else {
            card.setTicketBalance(card.getTicketBalance() - prize.getTicketsRequired());
            prize.setInventory(prize.getInventory() - 1);
            System.out.println("Premio " + prize.getName() + " concedido!");
            System.out.println("Restantes no estoque: " + prize.getInventory());
        }
    }
}