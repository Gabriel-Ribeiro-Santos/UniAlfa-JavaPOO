// Versão sem pacote.
public class Animal {
    // Atributo já existente.
    public String nome;

    // novos atributos (privados; acessíveis via getters/setters)
    private String racao;
    private double peso;

    // construtor padrão (mantém compatibilidade com new Animal() usado no projeto)
    public Animal() {
        this.nome = "";
        this.racao = "Desconhecida";
        this.peso = 0.0;
    }

    // construtor com parâmetros (opcional para uso futuro)
    public Animal(String nome, String racao, double peso) {
        this.nome = nome;
        this.racao = racao;
        this.peso = peso;
    }

    // getter e setter de ração
    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    // getter e setter de peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo.");
        }
        this.peso = peso;
    }

    // Método existente
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    @Override
    public String toString() {
        return "Animal{nome='" + nome + "', racao='" + racao + "', peso=" + peso + "}";
    }
}