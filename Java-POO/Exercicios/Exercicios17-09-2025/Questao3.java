import javax.swing.JOptionPane;

public class Questao3 {
    public static void main(String[] args) {
        // Pede o valor da transação.
        String transacaoStr = JOptionPane.showInputDialog("Digite o valor da transacao: ");
        double valorTransacao = Double.parseDouble(transacaoStr);

        // Pede o valor venal.
        String venalStr = JOptionPane.showInputDialog("Digite o valor venal:");
        double valorVenal = Double.parseDouble(venalStr);

        // Pede o percentual do imposto.
        String percStr = JOptionPane.showInputDialog("Digite o percential do imposto:");
        double percentual = Double.parseDouble(percStr);

        // Descobre o maior valor entre transação e venal.
        double maiorValor = Math.max(valorTransacao, valorVenal);

        // Calcula o imposto.
        double imposto = maiorValor * percentual / 100;

        // Mostra o resultado.
        JOptionPane.showMessageDialog(null, "Maior valor considerado: " + maiorValor + "\nValor do imposto: " + imposto);

    }
}