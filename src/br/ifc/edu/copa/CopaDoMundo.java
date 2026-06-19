package br.ifc.edu.copa;

public class CopaDoMundo {
	public static void main(String[] args) {
		// Instanciando o primeiro objeto (Jogador 1)
		Jogador craque1 = new Jogador("Neymar Jr.", 10);
		// Instanciando o segundo objeto (Jogador 2)
		Jogador craque2 = new Jogador("Lionel Messi", 10);

		// Chamando a ação (método)
		craque1.marcarGol(); // Exibe: Neymar Jr. balançou as redes! GOL!
		System.out.println(craque1.getNome() + " tem " + craque1.getGolsMarcados() + " gol(s).");
		System.out.println(craque2.getNome() + " tem " + craque2.getGolsMarcados() + " gol(s).");

		
		
		Selecao brasil = new Selecao("Brasil");
		brasil.adicionarJogador(craque1);
		brasil.adicionarJogador(craque2);

		Tecnico tecnicoBrasil = new Tecnico("Ancellotti", 60, "Mascar Chiclete");
		brasil.definirTecnico(tecnicoBrasil);

		Goleiro goleiro1 = new Goleiro("Alisson Becker", 1);
		goleiro1.sofrerGol();

		brasil.adicionarJogador(goleiro1);
		brasil.mostrarJogadores();
	}
}