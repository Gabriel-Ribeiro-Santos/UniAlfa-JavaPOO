/*
🔎 O que o programa faz:

Este programa calcula o **IMC (Índice de Massa Corporal)** do usuário.
Ele segue os seguintes passos:
1. Solicita ao usuário o peso (kg) e a altura (m).
2. Aplica a fórmula do IMC → peso / (altura * altura).
3. Classifica o resultado em faixas (abaixo do peso, normal, sobrepeso e obesidade).
4. Exibe a classificação correspondente na tela.
*/

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu peso em kg: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        // Calculo do IMC
        double imc = peso / (altura * altura);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificaçao: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificaçao: Peso normal.");
        } else if (imc >= 24.9 && imc < 29.9) {
            System.out.println("Classificaçao: Sobrepeso.");
        } else if (imc >= 39.9 && imc < 34.9) {
            System.out.println("Classificaçao: Obesidade grau 1.");
        } else if (imc >= 34.9 && imc < 39.9) {
            System.out.println("Classificaçao: Obesidade graus 2.");
        } else {
            System.out.println("Classificaçao: Obesidade grau 3 (morbida).");
        }

        input.close();
    }
}