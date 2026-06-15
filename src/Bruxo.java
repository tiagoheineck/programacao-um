// Bruxo é uma subclasse de Personagem. Demonstra herança e uso de campos private/protected.
public class Bruxo extends Personagem {
    // protected para que subclasses (Estudante, Funcionario) possam acessar diretamente
    protected String casa;

    // private para demonstrar encapsulamento — só acessível via getters/setters
    private String varinha;

    public Bruxo(String nome, int idade, String casa, String varinha) {
        super(nome, idade);
        this.casa = casa;
        this.varinha = varinha;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getVarinha() {
        return varinha;
    }

    public void setVarinha(String varinha) {
        this.varinha = varinha;
    }

    // Método que demonstra polimorfismo em tempo de execução: subclasses podem sobrescrever
    public void lancarFeitico(Feitico f) {
        System.out.println(getNome() + " (" + casa + ") lança o feitiço: " + f.getNome() + "!");
        f.executar(this);
    }

    // Implementação do método abstrato
    @Override
    public void agir() {
        System.out.println(getNome() + " está agindo como bruxo.");
    }
}
