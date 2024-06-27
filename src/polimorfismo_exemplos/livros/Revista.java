package polimorfismo_exemplos.livros;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Revista extends BaseFisica_Conceitual {

	public static Set<Revista> revistas = new HashSet<>();

	public Revista(Scanner scanner) {
		item = "revista";
		nome(scanner);
		tema(scanner);
		personagens(scanner);
		descricao(scanner);
		valor(scanner);
		revistas.add(this);
	}

	public void getRevista() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String formatador = String.format("Revista: %s\nTema: %s\nPersonagens: %s\nDescrição: %s\nValor: %d", nome,
				tema, personagens, descricao, valor);
		return formatador;
	}

}
