// Estudante representa um aluno de Hogwarts — herda de Bruxo.
public class Estudante extends Bruxo {
    // campo privado específico do estudante
    private int ano; // ano escolar (1..7)

    public Estudante(String nome, int idade, String casa, String varinha, int ano) {
        super(nome, idade, casa, varinha);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1) ano = 1;
        this.ano = ano;
    }

    // Sobrescrevemos lancarFeitico para mostrar comportamento específico de um estudante
    @Override
    public void lancarFeitico(Feitico f) {
        System.out.println(getNome() + " (Estudante - ano " + ano + ") prepara o feitiço: " + f.getNome());
        // estudantes podem ser menos poderosos: diminuir a eficácia
        Feitico mod = new Feitico(f.getNome(), Math.max(1, f.getPoder() - 10));
        mod.executar(this);
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " estuda na casa " + casa + " (ano " + ano + ").");
    }
}
