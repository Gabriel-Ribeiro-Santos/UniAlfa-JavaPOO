
// Importa as classes do pacote "animais".
import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Camelo;
import animais.Cavalo;
import animais.Tubarao;

// Classe principal com o método main
public class Heranca {
    public static void main(String[] args) {
        // Criando todos os animais.
        Animal a = new Animal("Nome Generico.", "Desconhecida.", "Desconhecida.", 0);
        Cachorro c = new Cachorro("Neguinha.", "Cachorro.", "Premium para cachorros.", 19);
        Gato g = new Gato("Zoe.", "Gato.", "Premium para gatos castrados.", 9);
        Camelo cam = new Camelo("Bactriano.", "Camelo.", "Racao para camelos.", 450);
        Cavalo cav = new Cavalo("Pe de pano.", "Cavalo.", "Capim.", 380);
        Tubarao t = new Tubarao("Bruce.", "Tubarao-branco.", "Peixes.", 800);

        // Chamando método auxiliar para exibir informações de cada animal.
        imprimirDados(a);
        imprimirDados(c);
        imprimirDados(g);
        imprimirDados(cam);
        imprimirDados(cav);
        imprimirDados(t);
    }

    // Método auxiliar que recebe um animal e imprimi todas informações formatadas.
    public static void imprimirDados(Animal animal) {
        System.out.println("---------Classe" + animal.getClass().getSimpleName() + "--------------");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Raca: " + animal.getRaca());
        System.out.print("Som: ");
        animal.emitirSom();
        System.out.println("Peso: " + (int) animal.getPeso() + "KG.");
        System.out.println("Racao: " + animal.getRacao());
        System.out.println("--------------Fim da Classe" + animal.getClass().getSimpleName() + "--------------\n");
    }
}