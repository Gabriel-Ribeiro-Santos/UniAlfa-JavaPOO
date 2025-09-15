package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Cachorro herda de animal
public class Cachorro extends Animal {

    // Construtor do cachorro recebendo atributos da Superclasse.
    public Cachorro(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // chama o construtor da Superclasse.
    }

    // Sobrescreve o método emitirSom da superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O Cachorro late: Au Au !!");
    }
}
