/*
🔎 O que o programa faz:

Este programa exibe a versão do Java que está sendo utilizada no sistema.
Passos do programa:

1. Obtém a versão do Java usando `System.getProperty("java.version")`.
2. Armazena essa informação em uma variável `versaoJava`.
3. Imprime a versão do Java na tela.
*/

public class VersaoJava {
    public static void main(String[] args) {
        String versaoJava = System.getProperty("java.version");
        System.out.println("Versao do Java:" + versaoJava);
    }
}