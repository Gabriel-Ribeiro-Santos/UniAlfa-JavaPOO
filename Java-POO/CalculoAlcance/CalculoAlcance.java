/*
🔎 O que o programa faz:

Este programa calcula o alcance de um projétil lançado por diferentes tipos de tanques.
Passos do programa:

1. Solicita que o usuário escolha um tanque entre três opções, definindo a velocidade inicial do projétil.
2. Solicita que o usuário digite o ângulo de lançamento em graus.
3. Converte o ângulo para radianos, necessário para cálculos trigonométricos.
4. Calcula o alcance usando a fórmula física: alcance = (velocidade^2 * seno(2 * ângulo)) / gravidade.
5. Exibe o alcance na tela, mostrando o valor em quilômetros.
*/

import java.util.Scanner; // Importa a classe Scanner para obter entrada do usuário.
import static java.lang.Math.sin; // Importa o método estático sin da classe Math.
import static java.lang.Math.PI; // Importa a constante estática PI da classe Math.

public class CalculoAlcance {

    // Método para permitir que o usuário selecione a velocidade.
    public static double selecionarVelocidade() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do console
        System.out.println("Escolher o tanque: "); // Exibe uma mensagem para o usuário.
        System.out.println("1 - M1 Abrams (~1700m/s)"); // Opção 1 de tanque e sua velocidade aproximada.
        System.out.println("2 - Obuseiro M109 (~600m/s)"); // Opção 2 de tanque e sua velocidade aproximada.
        System.out.println("3 - Gustav (~820m/s)"); // Opção 3 de tanque e sua velocidade aproximada.
        System.out.println("Digite o número da opcção desejada: "); // Solicita ao usuário que digite sua escolha.
        String opcao = scanner.nextLine(); // Lê a linha inteira da entrada do usuário (a opcção escolhida).

        // Utiliza uma estrutura switch para determinar velocidade com base na opcção do
        // usuário.
        switch (opcao) {
            case "1":
                return 1700.0; // Retorna a velocidade do M1 Abrams como um double.
            case "2":
                return 600.0; // Retorna a velocidade do Obuseiro M109 como um double.
            case "3":
                return 820.0; // Retorna a velocidade do Schwerer Gustav como um double.
            default:
                System.out.println("Opção inválida, usando valor padrão (15m/s)."); // Informa o usário sobre a opção
                                                                                    // inválida.
                return 15.0; // Retorna um valor de velocidade padrão como um double.
        }

        // O Scanner.close() seria melhor no método main após o uso, para evitar
        // fechá-lo prematuramente.
    }

    // Método para calcular o alcance do projétil com base na velocidade inicial e o
    // ângulo de lançamento.
    public static double calcularAlcance(double v0, double angulo) {
        // Converte o ângulo de graus para radianos (necessário para a função sin)
        double rad = (angulo / 180.0) * PI;

        // Calcula o alcance usando a fórmula física: alcance = (velocidade incial ^2 *
        // seno(2 * ângulo em radianos)) / aceleração da gravidade
        // A aceleração da gravidade (g) é aproximadamente 9.8 m/s^2
        double alcance = (v0 * v0 * sin(2 * rad)) / 9.8;
        return alcance; // Retorna o valor calculado do alcance como um double
    }

    // Método principal, ponto de entrada da aplicação Java
    public static void main(String[] args) {
        // Chama o método selecionarVelocidade para obter a velocidade inicial do
        // usuário.
        double v0 = selecionarVelocidade();
        Scanner scanner = new Scanner(System.in); // Cria um novo objeto Scanner para ler a entrada do ângulo.
        System.out.print("Digite o ângulo de lançamento (em graus): "); // Solicita ao usário que digite o ângulo.
        double te = scanner.nextDouble(); // Lê o valor do ângulo de lançamento como um double.

        // Chama o método calcularAlcance para obter o alcance com a velocidade e o
        // ângulo fornecidos.
        double A = calcularAlcance(v0, te);
        // Imprime o resultado formatado para o usuário.
        // %.1f formata um double como uma casa decimal.
        // %.2f formata um double com duas casas decimais.
        // %n insere uma nova linha.
        // O alcance é dividido por 1000.0 para ser exibido em quilômetros.
        System.out.printf("Para a velocidade inicial = %.1f m/s e ângulo = %.1f graus, o alcance é de %.2f km%n", v0,
                te, A / 1000.0);
        scanner.close(); // Fecha o objeto Scanner para liberar recursos do sistem.
    }
}