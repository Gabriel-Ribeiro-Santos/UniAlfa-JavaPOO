/*
🔎 O que o programa faz:

Este programa converte uma temperatura de **graus Celsius para Fahrenheit**.
Passos do programa:

1. Solicita ao usuário que digite a temperatura em Celsius.
2. Valida a entrada para garantir que seja um número, evitando erros.
3. Aplica a fórmula de conversão: F = (C × 9/5) + 32.
4. Exibe o resultado formatado na tela com uma casa decimal.
5. Fecha o Scanner ao final da execução.
*/

import java.util.Scanner;

public class ConversorCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        while (!scanner.hasNextDouble()) { // valida se a entrada é numérica.
            System.out.println("⚠ Valor inválido! Digite um número.");
            scanner.next(); // Descarta a entrada inválida.
            System.out.print("Digite a temperatura em graus Celsius: ");
        }

        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.1f °Celsius equivalem a %.1f °Fahrenheit%n", celsius, fahrenheit);

        scanner.close();
    }
}