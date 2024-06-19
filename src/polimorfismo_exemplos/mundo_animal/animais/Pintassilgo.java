package polimorfismo_exemplos.mundo_animal.animais;

import polimorfismo_exemplos.mundo_animal.Voadores;

public class Pintassilgo extends Voadores {

	@Override
	public void nome() {
		nome = "pintassilgo";
	}

	@Override
	public void alimentacao() {
		alimentacao = "pequenos animais e sementes (onívoro)";
	}
	
	@Override
	public void predadores() {
		predadores = "felinos, canídeos, répteis";
	}
	
	@Override
	public void bioma() {
		bioma = "selva";
	}
	
	@Override
	public void caracteristicas() {
		caracteristicas = "amarelado, canto estridente e contínuo";
	}
	
}
