import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Digite um número: ");
        System.out.println("String digitada: " + input);
        
        //Parse the input as an int.
        //Print its value +1
        int parsedInt = Integer.parseInt(input);
        System.out.println("Valor + 1: " + (parsedInt + 1));
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int inputOneLine = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        System.out.println("Valor da linha única + 1: " + (inputOneLine + 1));
    }
}