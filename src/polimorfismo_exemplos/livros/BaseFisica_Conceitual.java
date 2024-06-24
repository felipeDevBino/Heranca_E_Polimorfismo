package polimorfismo_exemplos.livros;

import java.util.Scanner;

public abstract class BaseFisica_Conceitual {

	protected String item;
	protected String nome;
	protected String tema;
	protected String enredo;
	protected String personagens;
	protected String descricao;
	protected String edicao="";
	protected String tipoDeCapa;
	protected String tipoDeFolha;
	public int valor;

	public void nome(Scanner scanner) {
		System.out.println("Registre o nome do " + item + ": ");
		nome = scanner.nextLine();
	}

	public void tema(Scanner scanner) {
		System.out.println("Descreva o tema: ");
		tema = scanner.nextLine();
	}

	public void enredo(Scanner scanner) {
		System.out.println("Escreva o enredo: ");
		enredo = scanner.nextLine();
	}

	public void personagens(Scanner scanner) {
		System.out.println("Escreva sobre os personagens: ");
		personagens = scanner.nextLine();
	}

	public void descricao(Scanner scanner) {
		System.out.println("Faça a descrição do " + item + ": ");
		descricao = scanner.nextLine();
	}

	public void edicao(Scanner scanner) {
		System.out.println("O " + item + " possui edição especial? ");
		String opcao = scanner.nextLine();
		if (opcao.equalsIgnoreCase("sim")) {
			System.out.println("Digite o nome da edição: ");
			nome = scanner.nextLine();
			tipoDeCapa(scanner);
			tipoDeFolha(scanner);
			edicao = String.format("Edição: %s\nTipo de capa: %s\nTipo de folha: %s\n\n", nome, tipoDeCapa,
					tipoDeFolha);
		}
	}

	public void tipoDeCapa(Scanner scanner) {
		System.out.println("Qual é o tipo de capa do(a) " + item + " para a edição de " + edicao + ": ");
		tipoDeCapa = scanner.nextLine();
	}

	public void tipoDeFolha(Scanner scanner) {
		System.out.println("Qual é o tipo de folha do(a) " + item + " para a edição de " + edicao + ": ");
		tipoDeFolha = scanner.nextLine();
	}

	public void valor(Scanner scanner) {
		System.out.println("Qual é o valor do(a) " + item + ": ");
		valor = Integer.parseInt(scanner.nextLine());
		System.out.println();
	}

	@Override
	public String toString() {
		return null;
	}
	
}
