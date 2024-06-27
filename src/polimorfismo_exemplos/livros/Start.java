package polimorfismo_exemplos.livros;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente herbert = new Cliente();
		herbert.setSaldo(500);

		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro01 = new Livro(scanner);
		Revista revista01 = new Revista(scanner);
		Jornal jornal01 = new Jornal(scanner);

		biblioteca.setItem(livro01);
		biblioteca.setItem(revista01);
		biblioteca.setItem(jornal01);
		
		biblioteca.compraItem(herbert, livro01.nome);
		biblioteca.compraItem(herbert, revista01.nome);
		biblioteca.compraItem(herbert, jornal01.nome);
		
		herbert.getComprados();
		biblioteca.getItens();		
		
		herbert.getSaldoImpresso();
		
		scanner.close();
	}
	
}
