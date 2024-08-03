package br.com.felipepoo.polimorfismo.mundoAnimal.animais;

import br.com.felipepoo.polimorfismo.mundoAnimal.Voadores;

public class Pintassilgo extends Voadores {

	public Pintassilgo() {
		nome = "pintassilgo";
		respiracao = "bico";
		locomocao = "asas";
		alimentacao = "alguns insetos e sementes (onívoro)";
		predadores = "felinos, canídeos, répteis";
		bioma = "selva";
		caracteristicas = "amarelado, canto estridente e contínuo";
	}
	
	@Override
	public void locomover() {
		System.out.println( String.format("O Pintassilgo voa com suas %s", locomocao));
	}
	
}
