package polimorfismo_exemplos.mundo_animal.animais;

import polimorfismo_exemplos.mundo_animal.Terrestres;

public class Pinscher extends Terrestres {

	@Override
	public void nome() {
		nome = "pinscher miniatura";
	}

	@Override
	public void alimentacao() {
		alimentacao = "carnes em geral, ocasionalmente vegetais, plantas e frutas (carnívoro facultativo)";
	}
	
	@Override
	public void predadores() {
		predadores = "Não possui predadores em zonas urbanas frequentadas por humanos";
	}
	
	@Override
	public void bioma() {
		bioma = "Zonas em que habitam humanos, incluem: florestas tropicais, savanas, pradarias, zonas urbanas e etc";
	}
	
	@Override
	public void caracteristicas() {
		caracteristicas = "geralmente de cor preta, pequeno e zangado";
	}
	
}
