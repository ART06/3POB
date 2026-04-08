public class PrisonTest_Student_7_5 {
    public static void main(String[] args) {
        Cell c1 = new Cell("A1", false, 1234);
        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, c1);
        
        bubba.setName("Bubba Smith"); 
        System.out.println("Nome atualizado: " + bubba.getName());
        
        bubba.display();
    }
}