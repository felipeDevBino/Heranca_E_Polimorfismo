package br.com.felipepoo.polimorfismo.revistaselivros;

public class Livro {

	protected String item;
	protected String autor;
	protected String nome;
	protected String genero;
	protected String sinopse;
	protected String formato;
	protected String dataDeLancamento;

	public Livro() {
		setItem("Livro");
	}

	public void setItem(String pItem) {
		item = pItem;
	}

	public void setAutor(String pAutor) {
		autor = pAutor;
	}

	public void setNome(String pNome) {
		nome = pNome;
	}

	public void setGenero(String pGenero) {
		genero = pGenero;
	}

	public void setSinopse(String pSinopse) {
		sinopse = pSinopse;
	}

	public void setFormato(String pFormato) {
		formato = pFormato;
	}

	public void setDataDeLancamento(String pDataDeLancamento) {
		dataDeLancamento = pDataDeLancamento;
	}

	public void aplicarEsquema(Livro paraAplicar) {
		paraAplicar.setItem(item);
		paraAplicar.setAutor(autor);
		paraAplicar.setNome(nome);
		paraAplicar.setGenero(genero);
		paraAplicar.setSinopse(sinopse);
		paraAplicar.setFormato(formato);
		paraAplicar.setDataDeLancamento(dataDeLancamento);
	}

	public void getLivro() {
		System.out.println(String.format("\n%s\nNome: %s\nGênero: %s\nSinopse: %s\nFormato: %s\nData de lançamento: %s",
				item, nome, genero, sinopse, formato, dataDeLancamento));
	}

}
