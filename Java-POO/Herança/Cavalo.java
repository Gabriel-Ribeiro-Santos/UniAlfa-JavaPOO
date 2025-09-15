// Subclasse Cavalo herda da Superclasse Animal.
public class Cavalo extends Animal {

    // Construtor do Cavalo recendo atributos da Superclasse.
    public Cavalo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Método sobrescrito para emitir som.
    @Override
    public void emitirSom() {
        System.out.println("O Cavalo relincha: Hiin In Inn!! ");
    }
}