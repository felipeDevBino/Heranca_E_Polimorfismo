package br.com.felipepoo.polimorfismo.revistaselivros;

public class Revista extends Livro {

	protected String editora;
	
	public Revista() {
		setItem("Revista");
	} 
	
	public void setEditora(String pEditora) {
		editora = pEditora;
	}
	
	@Override
	public void getLivro() {
		super.getLivro();
		System.out.println("Editora: " + editora);
	}
	
}
