package polimorfismo_exemplos.mundo_animal.animais;

import polimorfismo_exemplos.mundo_animal.Aquaticos;

public class Lambari extends Aquaticos {

	@Override
	public void nome() {
		nome = "lambari";
	}
	
	@Override
	public void alimentacao() {
		alimentacao = "combinação de plantas e carne (onívoro)";
	}

	@Override
	public void predadores() {
		predadores = "peixes carnívoros, pássaros, mamíferos em minoria";
	}
	
	@Override
	public void bioma() {
		bioma = "rios, lagos e mares";
	}
	
	@Override
	public void caracteristicas() {
		caracteristicas = "vive em água doce, pode se encontrar ocasionalmente em água salgada, vive em rios";
	}
	
		
	
}
