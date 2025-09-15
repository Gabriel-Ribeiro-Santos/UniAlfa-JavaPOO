// Subclasse Tubarao herda da Superclasse Animal.
public class Tubarao extends Animal {

    // Construtor de Tubarão recebendo os atributos da Superclasse.
    public Tubarao(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da classe Animal.
    }

    // Método sobrescrito para emitir Som.
    @Override
    public void emitirSom() {
        System.out.println("O tubarao nao tem um som definido!!");
    }
}