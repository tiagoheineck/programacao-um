package br.ifc.edu.copa;

//Goleiro HERDA de Jogador
public class Goleiro extends Jogador {
private int defesasRealizadas;
public Goleiro(String nome, int numeroCamisa) {
// super() chama o construtor da classe "mãe" (Jogador)
super(nome, numeroCamisa);
this.defesasRealizadas = 0;
}
public void fazerDefesa() {
this.defesasRealizadas++;
System.out.println("Que defesa espetacular do goleiro " + getNome() + "!");
}
public int getDefesasRealizadas() {
return this.defesasRealizadas;
}
}
