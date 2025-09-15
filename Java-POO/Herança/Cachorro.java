// A subclasse Cachorro herda da superclasse Animal.
public class Cachorro extends Animal {

    // Construtor do cachorro recebendo os atributos da superclasse.
    // Assim, quando criar um cachorro, você já informa o nome, raça, ração e peso.
    public Cachorro(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // chama o construtor da superclasse.
    }

    // Método sobrescrito para emitir o som.
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!!");
    }
}