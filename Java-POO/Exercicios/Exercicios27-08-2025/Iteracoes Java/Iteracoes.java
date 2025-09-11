/*
🔎 O que o programa faz:

Este programa demonstra o funcionamento dos operadores de **incremento e decremento** em Java.
Passos do programa:

1. Inicializa uma variável inteira `i` com valor 5.
2. Mostra o efeito do **pós-incremento (i++)**:
   - Primeiro imprime o valor atual de `i`.
   - Depois incrementa `i`.
3. Mostra o efeito do **pré-incremento (++i)**:
   - Incrementa `i` antes de imprimir o valor.
4. Mostra o efeito do **pós-decremento (i--)**:
   - Primeiro imprime o valor atual de `i`.
   - Depois decrementa `i`.
5. Mostra o efeito do **pré-decremento (--i)**:
   - Decrementa `i` antes de imprimir o valor.
6. Imprime cada etapa para que o usuário visualize como os valores de `i` mudam.
*/

public class Iteracoes {

    public static void main(String[] args) {
        int i = 5;

        // i++ (pós-incremento)
        System.out.println("i++:");
        System.out.println("Valor inicial de i: " + i);
        System.out.println("i++: " + i++);
        System.out.println("Valor de i após i++: " + i);
        System.out.println();

        // ++i (pré-incremento)
        System.out.println("++i:");
        System.out.println("Valor inicial de i: " + i);
        System.out.println("++i: " + ++i);
        System.out.println("Valor de i após ++i: " + i);
        System.out.println();

        // i-- (pós-decremento)
        System.out.println("i--:");
        System.out.println("Valor inicial de i: " + i);
        System.out.println("i--: " + i--);
        System.out.println("Valor de i após i--: " + i);
        System.out.println();

        // --i (pré-decremento)
        System.out.println("--i:");
        System.out.println("Valor inicial de i: " + i);
        System.out.println("--i: " + --i);
        System.out.println("Valor de i após --i: " + i);
    }
}