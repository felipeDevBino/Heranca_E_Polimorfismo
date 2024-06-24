package polimorfismo_exemplos.livros;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Livro extends BaseFisica_Conceitual {

	public static Set<Livro> livros = new HashSet<>();

	public Livro(Scanner scanner) {
		item = "livro";
		nome(scanner);
		tema(scanner);
		enredo(scanner);
		personagens(scanner);
		descricao(scanner);
		edicao(scanner);
		valor(scanner);
		livros.add(this);
	}

	public void getLivro() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String formatador = String.format("Livro: %s\nTema: %s\nEnredo: %s\nPersonagens: %s\nDescrição: %s\n%sValor: %d", nome, tema,
				enredo, personagens, descricao, edicao, valor);
		return formatador;
	}

}
