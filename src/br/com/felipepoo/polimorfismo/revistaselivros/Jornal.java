package br.com.felipepoo.polimorfismo.revistaselivros;

public class Jornal extends Livro {

	protected String informacoes;

	public Jornal() {
		setItem("Jornal");
	}

	public void setInformacoes(String pInformacoes) {
		informacoes = pInformacoes;
	}

	@Override
	public void aplicarEsquema(Livro paraAplicar) {
		paraAplicar.setItem(item);
		paraAplicar.setAutor(autor);
		paraAplicar.setNome(nome);
		paraAplicar.setFormato(formato);
		paraAplicar.setDataDeLancamento(dataDeLancamento);
	}

	@Override
	public void getLivro() {
		System.out.println(String.format(
				"\n%s\nNome do jornalista: %s\nRegião: %s\nTipo: %s\nAcontecimentos: %s\nData do jornal: %s", item,
				autor, nome, formato, informacoes, dataDeLancamento));

	}

}
