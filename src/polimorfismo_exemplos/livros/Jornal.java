package polimorfismo_exemplos.livros;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jornal extends BaseFisica_Conceitual {

	public static Set<Jornal> jornais = new HashSet<>();

	public Jornal(Scanner scanner) {
		item = "jornal";
		nome(scanner);
		tema(scanner);
		enredo(scanner);
		personagens(scanner);
		valor(scanner);
		jornais.add(this);
	}

	@Override
	public void tema(Scanner scanner) {
		System.out.println("Passe o título da notícia: ");
		tema = scanner.nextLine();
	}
	
	@Override
	public void personagens(Scanner scanner) {
		System.out.println("Escreva sobre as pessoas/personagens: ");
		personagens = scanner.nextLine();
	}

	@Override
	public void enredo(Scanner scanner) {
		System.out.println("Escreva sobre os acontecimentos/história: ");
		enredo = scanner.nextLine();
	}

	public void getJornal() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String formatador = String.format("Jornal: %s\nNotícia: %s\nAcontecimentos: %s\nSujeitos: %s\nValor: %d", nome,
				tema, enredo, personagens, valor                                                                                                                                                                                                                                                                                                                                  );
		return formatador;
	}

}
