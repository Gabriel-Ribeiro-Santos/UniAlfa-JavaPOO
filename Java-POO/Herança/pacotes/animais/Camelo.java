package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Camelo herda de animal
public class Camelo extends Animal {

    // Construtor de Camelo recebendo atributos da Superclasse.
    public Camelo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construto da Superclasse.
    }

    // Sobrescreve o método emitirSom() da Superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O Camelo faz um som: Braaa!!");
    }
}