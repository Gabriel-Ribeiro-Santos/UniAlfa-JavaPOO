package animais; // Define que essa classe pertence ao pacote "animais".

// Subclasse Cachorro herda de animal
public class Gato extends Animal {

    // Sobrescreve o método emitirSom da superclasse.
    @Override
    public void emitirSom() {
        System.out.println("O Gato mia: Miauu!!");
    }
}
