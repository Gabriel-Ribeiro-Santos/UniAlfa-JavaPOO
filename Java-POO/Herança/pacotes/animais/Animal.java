package animais; // Define que essa classe pertence ao pacote "animais"

// Superclasse Animal (Versão encapsulada com getters/setters).
public class Animal {
    // Atributos comuns a todos os animais (privado para encapsulamento).
    private String nome;
    private String raca;
    private String racao;
    private double peso;

    // Construtor com parametros (inicializa todos os campos).
    public Animal(String nome, String raca, String racao, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.racao = racao;
        setPeso(peso); // Usa o setter para aplicar validação.
    }

    // Getter e Setter do nome.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter da raça.
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Getter e Setter da ração.
    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    // Getter e Setter do peso com validação.
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo.");
        }
        this.peso = peso;
    }

    // Método que será sobrescrito pelas subclasses.
    public void emitirSom() {
        System.out.println("O anima faz um som!!");
    }
}