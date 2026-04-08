import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int escolhaAleatoria = rand.nextInt(3);
        String resultado;

        if (escolhaAleatoria == 0) {
            resultado = "pedra";
        } else if (escolhaAleatoria == 1) {
            resultado = "papel";
        } else {
            resultado = "tesoura";
        }

        System.out.println("O computador escolheu: " + resultado);
    }
}