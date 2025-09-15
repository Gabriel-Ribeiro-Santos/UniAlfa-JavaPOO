// Versão sem pacote.
public class Animal {
    // Atributo já existente.
    public String nome;

    // novos atributos (privados; acessíveis via getters/setters).
    private String raca;
    private String racao;
    private double peso;

    // construtor padrão (mantém compatibilidade com new Animal() usado no projeto)
    public Animal() {
        this.nome = "";
        this.raca = "Desconhecida"; // Inicializa raça padrão.
        this.racao = "Desconhecida"; // Inicializa ração padrão.
        this.peso = 0.0; // Inicializa peso padrão.
    }

    // construtor com parâmetros (opcional para uso futuro)
    public Animal(String nome, String raca, String racao, double peso) {
        this.nome = nome; // Atribui nome.
        this.raca = raca; // Atribui raça.
        this.racao = racao; // Atribui ração.
        this.setPeso(peso); // Usa setter para validação de peso.
    }

    // getter e setter de raça (raça do animal).
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // getter e setter de ração (Comida).
    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    // getter e setter de peso (Com validação simples).
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo.");
        }
        this.peso = peso;
    }

    // Método existente que pode ser sobrescrito pelas subclasses.
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    // toString
    @Override
    public String toString() {
        return "Animal{nome='" + nome + "' raca='" + raca + "', racao='" + racao + "', peso=" + peso + "}";
    }
}