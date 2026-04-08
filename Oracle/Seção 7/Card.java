public class Card {
    private int creditBalance;
    private int ticketBalance;
    private int cardNumber;
    private static int cardCount = 0;

    public Card() {
        cardCount++;
        this.cardNumber = cardCount;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }

    public int getCreditBalance() { return creditBalance; }
    public void setCreditBalance(int credits) { this.creditBalance = Math.max(0, credits); }

    public int getTicketBalance() { return ticketBalance; }
    public void setTicketBalance(int tickets) { this.ticketBalance = Math.max(0, tickets); }

    public int getCardNumber() { return cardNumber; }
}