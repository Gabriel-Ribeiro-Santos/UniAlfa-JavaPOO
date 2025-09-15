// Classe com o método principail Main.
public class Heranca {
    public static void main(String[] args) {

        // Criando todos os animais.
        Animal a = new Animal();
        a.nome = "Animal Generico.";
        a.setRaca("Desconhecida.");
        a.setRacao("Desconhecida.");
        a.setPeso(0);

        Cachorro c = new Cachorro("Neguinha.", "Cachorro.", "Premium para Cachorros.", 19);
        Gato g = new Gato("Zoe.", "Gato.", "Premiu para Gatos castrados.", 9);
        Camelo cam = new Camelo("Bactriano.", "Camelo.", "Racao para Camelos.", 450);
        Cavalo cav = new Cavalo("Pe de pano", "Cavalo.", "Capim", 380);
        Tubarao t = new Tubarao("Bruce", "Tubarao-Branco", "Peixes", 800);

        // Chamando o método auxiliar para exibir informacoes de cada animal.
        imprimirDados(a);
        imprimirDados(c);
        imprimirDados(g);
        imprimirDados(cam);
        imprimirDados(cav);
        imprimirDados(t);
    }

    // Método auxiliar que recebe uma animal e imprimi todas as informacoes
    // fromatadas.
    public static void imprimirDados(Animal animal) {
        System.out.println("---------Classe " + animal.getClass().getSimpleName() + "--------------");
        System.out.println("Nome: " + animal.nome);
        System.out.println("Raca: " + animal.getRaca());
        System.out.print("Som: ");
        animal.emitirSom(); // Polimorfismo: cada subclasse imprimir o seu som.
        System.out.println("Peso: " + (int) animal.getPeso() + "KG.");
        System.out.println("Racao: " + animal.getRacao());
        System.out.println("--------------Fim da Classe" + animal.getClass().getSimpleName() + "--------------\n");
    }
}
