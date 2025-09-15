package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Cachorro herda de animal
public class Gato extends Animal {

    // Contrutor de Gato recebendo atributos da Superclasse.
    public Gato(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Sobrescreve o método emitirSom da superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O Gato mia: Miauu!!");
    }
}
