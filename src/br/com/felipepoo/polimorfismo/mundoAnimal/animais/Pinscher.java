package br.com.felipepoo.polimorfismo.mundoAnimal.animais;

import br.com.felipepoo.polimorfismo.mundoAnimal.Terrestres;

public class Pinscher extends Terrestres {

	public Pinscher(){
		nome = "pinscher miniatura";
		respiracao = "respira raivosamente";
		locomocao = "quatro patas";
		alimentacao = "carnes em geral, ocasionalmente vegetais, plantas e frutas (carnívoro facultativo)";
		predadores = "Não possui predadores em zonas urbanas frequentadas por humanos";
		bioma = "Zonas em que habitam humanos, incluem: florestas tropicais, savanas, pradarias, zonas urbanas e etc";
		caracteristicas = "Geralmente preto, raivoso nível de periculosidade alto";
	}
	
	@Override
	public void comer() {
		System.out.println( String.format("O Pintier come com ravia não chegue perto, alimentação se baseia em %s", alimentacao) );
	}
	
}
