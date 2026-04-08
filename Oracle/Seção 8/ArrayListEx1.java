import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> estudantes = new ArrayList<>();
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");

        System.out.println("Lista inicial: " + estudantes);
        System.out.println("Tamanho inicial: " + estudantes.size());

        estudantes.add(0, "Nick"); 
        estudantes.add(1, "Mike");

        String removido = estudantes.remove(3);
        System.out.println("Estudante removido do índice 3: " + removido);

        System.out.println("Lista final: " + estudantes);
        System.out.println("Tamanho final: " + estudantes.size());
    }
}