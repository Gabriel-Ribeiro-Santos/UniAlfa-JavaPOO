import javax.swing.JOptionPane;

public class Questao4 {
    public static void main(String[] args) {
        // Pede a nota da prova 1.
        String nota1Str = JOptionPane.showInputDialog("Digite a nota da prova 1:");
        double nota1 = Double.parseDouble(nota1Str);

        // Pede a nota da prova 2.
        String nota2Str = JOptionPane.showInputDialog("Digite a nota da prova 2:");
        double nota2 = Double.parseDouble(nota2Str);

        // Pede a nota do trabalho.
        String trabStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double trabalho = Double.parseDouble(trabStr);

        // Calcula a média.
        double media = (nota1 + nota2 + trabalho) / 3;

        // Verifica se foi aprovado ou reprovado.
        String resultado;
        if (media >= 6) {
            resultado = "Aprovado!!";
        } else {
            resultado = "Reprovado!!";
        }

        // Mostra o resultado.
        JOptionPane.showMessageDialog(null, "Media: " + media + "\nResultado: " + resultado);
    }
}