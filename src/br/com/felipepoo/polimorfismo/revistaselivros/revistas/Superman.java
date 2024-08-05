package br.com.felipepoo.polimorfismo.revistaselivros.revistas;

import br.com.felipepoo.polimorfismo.revistaselivros.Revista;

public class Superman extends Revista {

	public Superman(Revista revistaDeHeroi) {
		revistaDeHeroi.aplicarEsquema(this);
		setAutor("Joe Shuster");
		setNome("Superman VS Metallo");
		setSinopse("Superman duela contra um vilão robô maligno com kriptonita no peito");
		setEditora("DC Comics");
	}
	
}
