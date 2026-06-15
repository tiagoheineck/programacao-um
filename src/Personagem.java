// Classe base abstrata que representa um personagem no mundo mágico.
// Demonstra visibilidade e encapsulamento: campos privados, protected e métodos públicos.
public abstract class Personagem {
    // protected: disponível para subclasses no mesmo pacote
    protected String nome;

    // private: somente acessível dentro desta classe — demonstra encapsulamento
    private int idade;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter público para o campo privado (encapsulamento)
    public String getNome() {
        return nome;
    }

    // Setter público com possibilidade de validação
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    // Método abstrato para forçar subclasses a implementarem comportamento próprio
    public abstract void agir();
}
