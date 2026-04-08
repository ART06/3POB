public class TestClass {
    public static void main(String[] args) {
        ComputeMethods comp = new ComputeMethods();
        
        double celsius = comp.fToC(100.4);
        System.out.println("Temp in celsius is " + celsius);
        
        double hypo = comp.hypotenuse(9, 6);
        System.out.println("Hypotenuse is " + hypo);
        
        int somaDados = comp.roll();
        System.out.println("The sum of the dice values is " + somaDados);
    }
}