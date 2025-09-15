package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Tubarão que herda de animal.
public class Tubarao extends Animal {

    // Construtor de Tubarão recebendo atributos da Superclasse.
    public Tubarao(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso); // Chama o construtor da Superclasse.
    }

    // Sobrescreve o método emitirSom() da superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O tubarao nao tem um som definido!!");
    }
}
