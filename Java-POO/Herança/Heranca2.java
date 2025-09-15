// Superclasse Animal
class Animal {
    // Atributo comum a todos os animais, acessível diretamente nas subclasses e
    // fora da classe.
    public String nome;
    private String raca;
    private String racao;
    private double peso;

    // Construtor padrão.
    public Animal() {
        this.nome = "";
        this.raca = "Desconhecida";
        this.racao = "Ração Comum";
        this.peso = 0;
    }

    // Construtor com parâmetros.
    public Animal(String nome, String raca, String racao, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.racao = racao;
        this.peso = peso;
    }

    // Getters e Setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo.");
        }
        this.peso = peso;
    }

    // Método que define um comportamento padrão para a emissão de som de um animal.
    // Este método será sobrescrito pelas subclasses para fornecer um comportamento
    // mais específico.
    public void emitirSom() {
        System.out.println("O animal faz um som generico.");
    }
}

// Subclasse Cachorro que herda da superclasse Animal.
class Cachorro extends Animal {
    public Cachorro(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso);
    }

    // Sobrescreve (override) o método emitirSom da superclasse Animal.
    // Isso permite que a classe Cachorro forneça sua própria implementação
    // específica para emitirSom.
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Subclasse Gato que herda da superclasse Animal.
class Gato extends Animal {
    public Gato(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso);
    }

    // Sobrescreve (override) o método emitirSom da superclasse Animal
    // Assim como a classe Cachorro, a classe Gato fornece sua própria implementação
    // específica para emitirSom.
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Subclasse Camelo que herda da superclasse Animal.
class Camelo extends Animal {
    public Camelo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso);
    }

    // Sobrescreve (override) o método emitirSom da superclasse Animal.
    @Override
    public void emitirSom() {
        System.out.println("O camelo faz um som: Braaa!");
    }
}

// Subclasse Cavalo que herda da superclasse Animal.
class Cavalo extends Animal {
    public Cavalo(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso);
    }

    // Sobrescreve (override) o método emitirSom da superclasse Animal.
    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Hiin in in!");
    }
}

// Subclasse Tubarao que herda da superclasse Animal.
class Tubarao extends Animal {
    public Tubarao(String nome, String raca, String racao, double peso) {
        super(nome, raca, racao, peso);
    }

    // Sobrescreve (override) o método emitirSom da superclasse Animal.
    @Override
    public void emitirSom() {
        System.out.println("O tubarao nao tem um som definido!!");
    }
}

// Classe principal que contém o método main, ponto de entrada da aplicação Java
public class Heranca2 {
    public static void main(String[] args) {
        // Criando todos os animais
        Animal a = new Animal("Animal Generico", "Desconhecida", "Racao Comum", 0);
        Cachorro c = new Cachorro("Neguinha", "Cachorro", "Premium para cachorros", 19);
        Gato g = new Gato("Zoe", "Gato", "Racao Premium", 9);
        Camelo cam = new Camelo("Bactriano", "Camelo", "Racao para camelos", 450);
        Cavalo cav = new Cavalo("Pe de pano", "Cavalo", "Capim", 380);
        Tubarao t = new Tubarao("Bruce", "Tubarao-Branco", "Peixes", 800);

        // Imprimir informações de cada animal usando método auxiliar
        imprimirInformacoes(a);
        imprimirInformacoes(c);
        imprimirInformacoes(g);
        imprimirInformacoes(cam);
        imprimirInformacoes(cav);
        imprimirInformacoes(t);
    }

    // Método auxiliar para imprimir informações formatadas de qualquer animal
    public static void imprimirInformacoes(Animal animal) {
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