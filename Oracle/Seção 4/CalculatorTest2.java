public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        Calculator2 calc = new Calculator2();
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party

        // Pessoa 1
        calc.originalPrice = 10;
        calc.findTotal();

        // Pessoa 2
        calc.originalPrice = 12;
        calc.findTotal();

        // Pessoa 3
        calc.originalPrice = 9;
        calc.findTotal();

        // Pessoa 4
        calc.originalPrice = 8;
        calc.findTotal();

        // Pessoa 5
        calc.originalPrice = 7;
        calc.findTotal();

        // Pessoa 6 (Alex)
        calc.originalPrice = 15;
        calc.findTotal();

        // Pessoa 7
        calc.originalPrice = 11;
        calc.findTotal();

        // Pessoa 8
        calc.originalPrice = 30;
        calc.findTotal();
    }
}