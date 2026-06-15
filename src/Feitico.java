// Classe simples que representa um feitiço.
public class Feitico {
    private String nome;
    private int poder; // valor numérico que representa a "força" do feitiço

    public Feitico(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    // Executa o feitiço — comportamento pode depender do Bruxo que lança
    public void executar(Bruxo caster) {
        // Exemplo simples: se o caster é Estudante, mostra mensagem diferente
        if (caster instanceof Estudante) {
            System.out.println("(Executando em modo ESTUDANTE) " + caster.getNome() + " lançou " + nome + " com poder " + poder + ".");
        } else if (caster instanceof Funcionario) {
            System.out.println("(Executando em modo FUNCIONARIO) " + caster.getNome() + " lançou " + nome + " com poder " + poder + ".");
        } else {
            System.out.println(caster.getNome() + " lançou " + nome + " com poder " + poder + ".");
        }
    }
}
