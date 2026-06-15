import java.util.ArrayList;
import java.util.List;

public class Main {

	// Exemplo didático em Português usando o universo de Harry Potter.
	// Conceitos demonstrados: Classe, visibilidade (private/protected/public),
	// encapsulamento (getters/setters), herança e polimorfismo.

	public static void main(String[] args) {
		// Criamos alguns feitiços
		Feitico expelliarmus = new Feitico("Expelliarmus", 50);
		Feitico stupefy = new Feitico("Stupefy", 70);

		// Criamos bruxos: estudantes e funcionários
		Bruxo harry = new Estudante("Harry Potter", 17, "Grifinoria", "Varinha de azevinho", 7);
		Bruxo hermione = new Estudante("Hermione Granger", 17, "Grifinoria", "Varinha de videira", 7);
		Bruxo snape = new Funcionario("Severus Snape", 38, "Sonserina", "Varinha de nogueira", "Professor de Poções");

		// Lista do tipo Bruxo para demonstrar polimorfismo (estudante e funcionário tratados como Bruxo)
		List<Bruxo> bruxos = new ArrayList<>();
		bruxos.add(harry);
		bruxos.add(hermione);
		bruxos.add(snape);

		System.out.println("-- Demonstração de encapsulamento e visibilidade --");
		// Não é possível acessar campos privados diretamente (ex.: idade ou varinha)
		// harry.idade = 18; // ERRO: 'idade' é private em Personagem
		// harry.varinha = "nova"; // ERRO: 'varinha' é private em Bruxo

		// Usamos getters/setters públicos para interagir com campos privados
		System.out.println(harry.getNome() + " tem " + harry.getIdade() + " anos.");
		harry.setIdade(18); // exemplo de encapsulamento: validação poderia ocorrer aqui
		System.out.println("Depois de usar setter: " + harry.getNome() + " tem " + harry.getIdade() + " anos.");

		System.out.println("\n-- Demonstração de polimorfismo: lançarFeitico() sobrescrito --");
		for (Bruxo b : bruxos) {
			// Todos são do tipo Bruxo, mas a implementação de lançarFeitico pode variar
			b.lancarFeitico(expelliarmus);
			b.lancarFeitico(stupefy);
			System.out.println();
		}

		System.out.println("-- Demonstração de herança e métodos protegidos --");
		// Métodos/propriedades protected podem ser acessados por subclasses
		// Por exemplo, Bruxo.protectedInfo() pode usar o campo protected 'casa'
		System.out.println(((Estudante) harry).getCasa());

		System.out.println("\nFim da demonstração.");
	}
}
