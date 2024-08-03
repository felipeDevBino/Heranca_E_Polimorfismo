package br.com.felipepoo.polimorfismo.mundoAnimal.animais;

import br.com.felipepoo.polimorfismo.mundoAnimal.Aquaticos;

public class Lambari extends Aquaticos {

	public Lambari() {
		nome = "lambari";
		respiracao = "respira por branquias";
		locomocao = "nadadeiras";
		alimentacao = "combinação de plantas e carne (onívoro)";
		predadores = "peixes carnívoros, pássaros, mamíferos em minoria";
		bioma = "rios, lagos e mares";
		caracteristicas = "vive em água doce, pode se encontrar ocasionalmente em água salgada, vive em rios";
	}
	
	@Override
	public void locomover() {
		System.out.println( String.format("O Lambari está nadando com suas %s", locomocao) );
	}
	
}
