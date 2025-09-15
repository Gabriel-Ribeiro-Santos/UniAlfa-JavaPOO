// Suclasse Camelo herda da Superclasse Animal.
public class Camelo extends Animal {

    // Construtor de Camelo recebendo os atributos da Superclasse.
    public Camelo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Método sobrescrito para emitir som
    @Override
    public void emitirSom() {
        System.out.println("O Camelo faz um som: Braaa!! ");
    }
}