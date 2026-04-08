public class PrisonTest_Student_7_4 {
    public static void main(String[] args) {
        
        Prisoner_Student_7_4 p02 = new Prisoner_Student_7_4();
        System.out.println("Dados Iniciais p02");
        p02.display();

        System.out.println("\nDados Completos p01");
        Prisoner_Student_7_4 p01 = new Prisoner_Student_7_4("Bubba", 2.08, 4);
        
        p01.display(true); 
    }
}