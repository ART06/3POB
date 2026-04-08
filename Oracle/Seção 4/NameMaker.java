import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String primNome, nomeMeio, ultimoNome, nomeTodo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome:");
        primNome = sc.nextLine();
        
        System.out.println("Digite o nome do meio:");
        nomeMeio = sc.nextLine();
        
        System.out.println("Digite o sobrenome:");
        ultimoNome = sc.nextLine();
        
        nomeTodo = primNome + ' ' + nomeMeio + ' ' + ultimoNome;
        
        System.out.println("\nNome completo: " + nomeTodo);
        
        sc.close();
    }
}