public class PrisonTest_Student_7_6 {
    public static void main(String[] args) {
        Cell_Student_7_6 cellA1 = new Cell_Student_7_6("A1", false, 1234);

        new Prisoner_Student_7_6("Bubba", 2.08, 4, cellA1);
        new Prisoner_Student_7_6("Twitch", 1.73, 3, cellA1);

        int total = Prisoner_Student_7_6.getPrisonerCount();
        
        System.out.println("O sistema registra um total de: " + total + " prisioneiros.");
    }
}