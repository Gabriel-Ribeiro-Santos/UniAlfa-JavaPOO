package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Cachorro herda de animal
public class Cavalo extends Animal {

    // Construtor de Cavalo recebendo atributos da Superclasse.
    public Cavalo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Sobrescreve o método emitirSom() da Superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O Cavalo relincha: Hiin In Inn!!");
    }
}
