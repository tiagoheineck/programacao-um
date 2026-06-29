package memes;

public class MuitoBom {

	public static void main(String[] args) {
		// Códigos ANSI para cores e resetar
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GOLD = "\u001B[33m"; // Amarelo/Dourado
        final String ANSI_GREY = "\u001B[90m"; // Cinza claro/Grafite

        // Símbolo da estrela (Unicode)
        final String ESTRELA = "★";

        // Imprime a mensagem inicial
        System.out.println("Muito bom");

        // Monta a string das estrelas com cores
        String estrelas = ANSI_GOLD + ESTRELA + ANSI_RESET +
                          ANSI_GREY + ESTRELA + ESTRELA + ESTRELA + ESTRELA + ANSI_RESET;

        // Imprime as estrelas coloridas
        System.out.println(estrelas);
	}

}
