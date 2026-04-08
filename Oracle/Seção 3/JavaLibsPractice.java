import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o nome do herói?");
        String lugar = JOptionPane.showInputDialog("Em qual lugar a aventura acontece?");
        String monstroNome = JOptionPane.showInputDialog("Qual o nome da espécie do monstro?");
        
        String inputMonstros = JOptionPane.showInputDialog("Quantos " + monstroNome + " apareceram?");
        int numMonst = Integer.parseInt(inputMonstros);
        
        String inputDano = JOptionPane.showInputDialog("Com " + numMonst + " monstros vindo, quanto de dano sua espada causa?");
        int danoBase = Integer.parseInt(inputDano);
        
        String inputBono = JOptionPane.showInputDialog("Qual o multiplicador de bônus mágico da sua arma?");
        double bonus = Double.parseDouble(inputBono);
        
        String inputTesouro = JOptionPane.showInputDialog("Qual o valor do tesouro em moedas de ouro que eles guardam?");
        double tesouroTotal = Double.parseDouble(inputTesouro);
        
        String elemento = JOptionPane.showInputDialog("Seu personagem é de qual elemento?");

        String clima = JOptionPane.showInputDialog("Como está o clima?");

        String grito = JOptionPane.showInputDialog("Qual seu grito de guerra?");

        int danoTotal = (int) (danoBase * bonus);
        double tesouroPorMonstro = tesouroTotal / numMonst;
        int monstrosRestantes = numMonst - 1;

        String historia = "O  " + nome + " de elemento " + elemento + " chegou a " + lugar + ".\n" +
                "O dia estava " + clima + " quando " + numMonst + " " + monstroNome + " surgiram!\n" +
                "Com um bônus de " + bonus + ", seu dano subiu para " + danoTotal + ".\n" +
                "\"" + grito + "!\" - você gritou, derrotando um deles.\n" +
                "Restam apenas " + monstrosRestantes + " monstros agora.\n" +
                "Cada um carregava " + tesouroPorMonstro + " moedas de ouro.\n" +
                "Parabéns, " + nome + ", você ficou rico!";

        JOptionPane.showMessageDialog(null, historia, "A Lenda de " + nome, 1);
    }
}