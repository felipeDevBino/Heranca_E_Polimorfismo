package br.com.felipepoo.polimorfismo.revistaselivros;

import br.com.felipepoo.polimorfismo.revistaselivros.revistas.HomemAranha;
import br.com.felipepoo.polimorfismo.revistaselivros.revistas.DragonBallZ;
import br.com.felipepoo.polimorfismo.revistaselivros.livros.OPrincipe;
import br.com.felipepoo.polimorfismo.revistaselivros.livros.OCemiterio;
import br.com.felipepoo.polimorfismo.revistaselivros.revistas.Superman;
import br.com.felipepoo.polimorfismo.revistaselivros.jornais.JornalLocal;

public class Start {

	public static void main(String[] args) {
		
		HomemAranha homemAranhaVsVenom = new HomemAranha();
		homemAranhaVsVenom.getLivro();
		
		DragonBallZ dragonBallz = new DragonBallZ();
		dragonBallz.getLivro();
	
		OPrincipe oPrincipe = new OPrincipe();
		oPrincipe.getLivro();
		
		OCemiterio oCemiterio = new OCemiterio();
		oCemiterio.getLivro();
		
		Superman supermanVsMetallo = new Superman(homemAranhaVsVenom);
		supermanVsMetallo.getLivro();
		
		JornalLocal jornalLocal = new JornalLocal();
		jornalLocal.getLivro();
		
	}	
	
}
