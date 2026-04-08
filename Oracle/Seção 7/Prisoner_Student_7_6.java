public class Prisoner_Student_7_6 {
    private String name;
    private double height;
    private int sentence;
    private Cell_Student_7_6 cell;
    private int bookingNumber;

    private static int prisonerCount = 0;

    public Prisoner_Student_7_6(String name, double height, int sentence, Cell_Student_7_6 cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        this.bookingNumber = prisonerCount;
    }

    public static int getPrisonerCount() {
        return prisonerCount;
    }

    /*
    public static void display() {
        System.out.println("Name: " + name); // ERRO: Non-static field 'name' cannot be referenced from a static context
        System.out.println("Booking Number: " + bookingNumber); // ERRO: Non-static field 'bookingNumber' cannot be referenced...
        System.out.println("Total: " + prisonerCount); // OK: PrisonerCount é estático
    }
    */

    public void display() {
        System.out.println("Name: " + name + " | Booking: " + bookingNumber);
    }

    // Getters omitidos para brevidade...
}