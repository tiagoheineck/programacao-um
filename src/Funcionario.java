// Funcionario representa um membro do staff (ex.: professor) — herda de Bruxo.
public class Funcionario extends Bruxo {
    private String cargo;

    public Funcionario(String nome, int idade, String casa, String varinha, String cargo) {
        super(nome, idade, casa, varinha);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Funcionários costumam ser mais experientes: podem aumentar o poder do feitiço
    @Override
    public void lancarFeitico(Feitico f) {
        System.out.println(getNome() + " (Funcionario: " + cargo + ") conjura com autoridade: " + f.getNome());
        Feitico mod = new Feitico(f.getNome(), f.getPoder() + 20);
        mod.executar(this);
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " atua como " + cargo + " na casa " + casa + ".");
    }
}
