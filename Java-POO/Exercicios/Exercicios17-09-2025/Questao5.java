import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a idade.
        System.out.print("Digite a idade da pessoa (anos): ");
        int idade = sc.nextInt();

        // Lê o sexo (M/F). Aceita maiúscula ou minúscula.
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        String sexoStr = sc.next();
        char sexo = Character.toUpperCase(sexoStr.charAt(0)); // pega o primeiro caracter e coloca em maiúscula.

        // Lê os anos de contribuição.
        System.out.print("Digite a quantidade de anos de contribuicao: ");
        int anosContrib = sc.nextInt();

        // Define os requisitos conforme o sexo.
        int idadeMin;
        int tempoMin;

        if (sexo == 'F') {
            idadeMin = 60;
            tempoMin = 30;
        } else { // Assume masculino para qualquer outra entrada (M ou outras).
            idadeMin = 65;
            tempoMin = 35;
        }

        // Verifica se já tem direito por idade ou por tempo de contribuição.
        if (idade >= idadeMin || anosContrib >= tempoMin) {
            System.out.println("Voce ja tem o direito a aposentadoria.");
        } else {
            // Calcular quanto tempo falta para cada requisito (sempre positivo aqui).
            int faltaContrib = tempoMin - anosContrib;
            int faltaIdade = idadeMin - idade;

            System.out.println("Ainda nao tem direito a aposentadoria.");
            System.out.println("Faltam " + faltaContrib + " anos de contribuicao para atingir o tempo minimo.");
            System.out.println("Faltam " + faltaIdade + " anos para atingir a idade minima.");

            // Indica o caminho mais rápido (menos anos faltantes).
            if (faltaContrib < faltaIdade) {
                System.out.println("Caminho mais rapido: completar o tempo de contribuicao (faltam " + faltaContrib + " anos).");
            } else if (faltaIdade < faltaContrib) {
                System.out.println("Caminho mais rapido: atingir a idade minima (faltam " + faltaIdade + " anos).");
            } else {
                System.out.println("Ambos os caminhos exigem o mesmo tempo (" + faltaContrib + " anos).");
            }
        }

        sc.close();
    }
}