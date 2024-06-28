package br.com.felipepoo.heranca.arvoregenealogica;

public class Passado extends AntePassado {

	protected static String caractrHerdadoPassado;
	protected String caractr;
	
	public Passado(String nome, String personalidade, String caracteristicas, String doencas) {
		
		super(nome, personalidade, caracteristicas);		
		
		this.doencas = doencas;

	}
	

}
