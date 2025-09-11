/*
🔎 O que o programa faz:

Este programa exibe informações detalhadas do Java e da JVM em execução.
Inclui:
1. Versão do Java.
2. Nome e fornecedor da JVM.
3. Nome do JDK / Runtime.
4. Sistema Operacional.
*/

public class VersaoJavaV2 {

    public static void main(String[] args) {
        System.out.println("=== Informacoes do Java e JVM ===\n");

        // Versão do Java.
        System.out.println("Versao do Java: " + System.getProperty("java.version"));

        // Nome da JVM.
        System.out.println("Nome da JVM: " + System.getProperty("java.vm.name"));

        // Fornecedor da JVM.
        System.out.println("Fornecedor da JVM: " + System.getProperty("java.vm.vendor"));

        // Nome do JDK / Runtime.
        System.out.println("Nome do JDK / Runtime: " + System.getProperty("java.runtime.name"));

        // Sistema Operacional.
        System.out.println("Sistema Operacional: " + System.getProperty("os.name") + " "
                + System.getProperty("os.version") + " (" + System.getProperty("os.arch") + ")");

        System.out.println("\n=== Fim das Informacoes ===");
    }
}