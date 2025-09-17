import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        // Criamos o leitor de dados do teclado.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pergunta o valor do produto.
        System.out.print("Digite o valor do produto: ");
        double valorProduto = Double.parseDouble(br.readLine());

        // Pergunta o percentual de desconto.
        System.out.print("Digite o percentual de desconto: ");
        double percentual = Double.parseDouble(br.readLine());

        // Calcula o valor do desconto.
        double valorDesconto = valorProduto * percentual / 100;

        // Calcula o valor final com desconto.
        double valorComDesconto = valorProduto - valorDesconto;

        // Mostra os resultados.
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}