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

/*
 * Analisando o que o programa faz:
 * Ele começa com i = 5 e vai imprimindo valores de i enquanto aplica os
 * operadores ++ e -- em suas duas formas:
 * - Pós-incremento (i++): usa o valor atual e depois incrementa.
 * - Pré-incremento (++i): incrementa primeiro e depois usa o valor.
 * - Pós-decremento (i--): usa o valor atual e depois decrementa.
 * - Pré-decremento (--i): decrementa primeiro e depois usa o valor.
 */