// Subclasse Gato herda da Superclasse Animal.
public class Gato extends Animal {

    // Construtor do gato recebendo os atributos da Superclasse.
    public Gato(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Método sobrescrito para emitir som.
    @Override
    public void emitirSom() {
        System.out.println("O Gato mia: Miauu!!");
    }
}
