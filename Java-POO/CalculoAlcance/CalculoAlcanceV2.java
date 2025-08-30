/*
🔎 O que o programa faz:

Este programa é uma versão melhorada que calcula o alcance de um projétil lançado por diferentes tanques de forma interativa.
Principais melhorias nesta versão:

1. Usa apenas um Scanner passado como parâmetro para evitar duplicação.
2. Valida a entrada do usuário, impedindo que o programa quebre se digitar letras.
3. Permite múltiplos cálculos em um loop até o usuário decidir sair.
4. Exibe o alcance em metros e quilômetros para melhor compreensão.
5. Pergunta ao usuário se deseja continuar ou encerrar após cada cálculo.
*/

import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.PI;

public class CalculoAlcanceV2 {

    // Método para selecionar a velocidade incial de acordo com a escolha do
    // usuário.
    public static double selecionarVelocidade(Scanner scanner) {
        System.out.println("\nEscolha o tanque:");
        System.out.println("1 - M1 Abrams (~1700 m/s)");
        System.out.println("2 - Obuseiro M109 (~600 m/s)");
        System.out.println("3 - Gustav (~820 m/s)");
        System.out.print("Digite o número da opção desejada: ");

        String opcao = scanner.nextLine();

        switch (opcao) {
            case "1":
                return 1700.0;
            case "2":
                return 600.0;
            case "3":
                return 820.0;
            default:
                System.out.println("⚠ Opção inválida, usando valor padrão (15 m/s).");
                return 15.0;
        }
    }

    // Método que calcula o alcance do projétil.
    public static double calcularAlcance(double v0, double angulo) {
        double rad = (angulo / 180.0) * PI; // Conversão de graus para radianos.
        return (v0 * v0 * sin(2 * rad)) / 9.8; // Fórmula física do alcance.
    }

    // Método principal.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            double v0 = selecionarVelocidade(scanner);

            System.out.print("Digite o ângulo de lançamento (em graus): ");
            while (!scanner.hasNextDouble()) { // Validação para evitar erro se digitar letra
                System.out.println("⚠ Valor inválido! Digite um número.");
                scanner.next(); // Descarta entrada inválida.
                System.out.println("Digite um ângulo de lançamento (em graus): ");

            }
            double angulo = scanner.nextDouble();
            scanner.nextLine(); // Limpa Buffer

            double alcance = calcularAlcance(v0, angulo);

            System.out.printf("👉 Para velocidade inicial = %.1f m/s e ângulo = %.1f°:%n", v0, angulo);
            System.out.printf("   Alcance = %.2f metros (%.2f km)%n", alcance, alcance / 1000.0);

            // Perguntar se o usuário quer continuar.
            System.out.print("\nDeseja calcular outro alcance ? (s/n)");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
            }

        }

        System.out.println("Programa encerrado. ✅");
        scanner.close();
    }
}
