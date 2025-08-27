import java.util.Scanner; // Importa a classe Scanner para ler dados do usuáro.

public class CalculadoraProduto {
    public static void main(String[] args) {

        // Criar um objeto Scanner para ler entradas do teclado.
        Scanner input = new Scanner(System.in);

        // Pedir e armazenar os números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();

        // Calcular o produto (multiplicação dos três números)
        int produto = num1 * num2 * num3;

        // Mostra o resultado
        System.out.println("O produto dos três números é: " + produto);

        // Fechar o Scanner.
        input.close();
    }
}