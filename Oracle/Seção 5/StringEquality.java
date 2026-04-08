import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String name = in.nextLine();
        
        if (name.equals("Moe")) {
            System.out.println("Você é o rei do rock and roll");
        } 
        else {
            System.out.println("Você não é o rei");
        }
        
        in.close();
    }
}