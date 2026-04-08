public class PrizeCategory {
    private String name;
    private int ticketsRequired;
    private int inventory;

    public PrizeCategory(String name, int ticketsRequired, int inventory) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.inventory = inventory;
    }

    public String getName() { return name; }
    public int getTicketsRequired() { return ticketsRequired; }
    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }
}