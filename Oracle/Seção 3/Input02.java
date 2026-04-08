import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "A configuração do sistema foi atualizada!",
                "Aviso do Sistema",
                1);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Em que ano estamos?",
                "Contador de Anos",
                3,
                null,
                null,
                "0");
        
        int anoFuturo = Integer.parseInt(input1) + 10;
        System.out.println("Daqui a 10 anos será: " + anoFuturo);

        
        String[] cores = {"Amarelo", "Vermelho", "Roxo"};
        String escolha = (String)JOptionPane.showInputDialog(null,
                "Qual sua cor favorita?",
                "Seleção de Cores",
                2,
                null,
                cores,
                cores[0]);
                
        System.out.println("Cor escolhida: " + escolha);
    }
}