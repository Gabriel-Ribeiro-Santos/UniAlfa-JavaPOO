import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os pontos: primeiro o líder, depois o lanterna.
        System.out.print("Digite os pontos do Lider: ");
        int lider = sc.nextInt();

        System.out.print("Digite os pontos do lanterna: ");
        int lanterna = sc.nextInt();

        // Calcula a diferença.
        int dif = lider - lanterna;

        // Se a diferença for menor ou igual a zero, não precisa de vitórias.
        if (dif <= 0) {
            System.out.println("Vitorias necessarias: 0");
        } else {
            // (dif +2) / 3 faz o teto da divisão inteira por 3.
            int vitorias = (dif +2) / 3;
            System.out.println("Vitorias necessarias: " + vitorias);
        }

        sc.close();
    }
}